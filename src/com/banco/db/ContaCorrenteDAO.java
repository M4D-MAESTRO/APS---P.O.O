package com.banco.db;

import com.banco.domain.ContaCorrente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaCorrenteDAO implements DAO<ContaCorrente> {

    @Override
    public void inserir(ContaCorrente obj) {
        Connection con = Conexao.getConexao();
        String query = "INSERT INTO contaBancaria values(" + null + ", " + obj.getSaldo() + ")";
        try {
            Statement s = con.prepareStatement(query);
            s.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = s.getGeneratedKeys();
            rs.first();

            String query2 = "INSERT INTO contaCorrente values(" + obj.getTaxaDeOperacao() + ", " + rs.getInt(1) + ")";
            s = con.prepareStatement(query2);
            s.execute(query2);

        } catch (SQLException ex) {
            Logger.getLogger(ContaCorrenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String a[]) {
        ContaCorrenteDAO dao = new ContaCorrenteDAO();
        ContaCorrente c = new ContaCorrente(null, 1000.00, 0.0);
        dao.inserir(c);
        
        System.out.println(dao.getByNumeroConta((long)1));

        //dao.listarTodos().stream().forEach(conta -> System.out.println(conta.mostrarDados()));
        //dao.deletar(new ContaCorrente(Long.parseLong("7")));
        //dao.atualizar(new ContaCorrente((long) 6, 800.0, 10.0));
    }

    @Override
    public List<ContaCorrente> listarTodos() {
        List<ContaCorrente> lista = new ArrayList<>();

        Connection con = Conexao.getConexao();
        String query = "SELECT contaBancaria.numeroConta, contaBancaria.saldo, contaCorrente.taxaDeOperacao "
                + " FROM contaBancaria "
                + "JOIN contaCorrente ON contaBancaria.numeroConta = contaCorrente.numeroConta";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ContaCorrente cc = new ContaCorrente((long) rs.getInt("numeroConta"), rs.getDouble("saldo"), rs.getDouble("taxaDeOperacao"));
                lista.add(cc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContaCorrenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    @Override
    public void deletar(ContaCorrente obj) {
        Connection con = Conexao.getConexao();
        String query = "DELETE FROM contaCorrente WHERE numeroConta = " + obj.getNumeroConta();

        try {
            Statement s = con.prepareStatement(query);
            s.execute(query);

            query = "DELETE FROM contaBancaria WHERE numeroConta = " + obj.getNumeroConta();
            s = con.prepareStatement(query);
            s.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(ContaCorrenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(ContaCorrente obj) {
        Connection con = Conexao.getConexao();
        String query = "UPDATE contaBancaria "
                + "SET saldo = ? "
                + "WHERE numeroConta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, obj.getSaldo());
            ps.setLong(2, obj.getNumeroConta());
            ps.executeUpdate();

            query = "UPDATE contaCorrente "
                    + "SET taxaDeOperacao = ? "
                    + "WHERE numeroConta = ?";
            ps = con.prepareStatement(query);
            ps.setDouble(1, obj.getTaxaDeOperacao());
            ps.setLong(2, obj.getNumeroConta());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ContaCorrenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ContaCorrente getByNumeroConta(Long id) {
        ContaCorrente cc = null;
        Connection con = Conexao.getConexao();
        String query = "SELECT contaBancaria.numeroConta, contaBancaria.saldo, contaCorrente.taxaDeOperacao from contaBancaria"
                + " JOIN contaCorrente"
                + " WHERE contaBancaria.numeroConta = contaCorrente.numeroConta AND contaCorrente.numeroConta = ?";

        try {
             PreparedStatement ps = con.prepareStatement(query);
             ps.setLong(1, id);
             
             ResultSet rs = ps.executeQuery();
             rs.first();
             
             cc = new ContaCorrente(rs.getLong("numeroConta"), rs.getDouble("saldo"), rs.getDouble("taxaDeOperacao"));
             
        } catch (SQLException ex) {
            Logger.getLogger(ContaCorrenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return cc;
    }

}
