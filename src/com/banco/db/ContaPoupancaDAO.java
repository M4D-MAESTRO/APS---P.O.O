/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.db;

import com.banco.domain.ContaPoupanca;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2017102465
 */
public class ContaPoupancaDAO implements DAO<ContaPoupanca> {

    @Override
    public void inserir(ContaPoupanca obj) {
        Connection con = Conexao.getConexao();
        String query = "INSERT INTO contaBancaria VALUES(" + null + ", " + obj.getSaldo() + ")";

        try {
            Statement s = con.prepareStatement(query);
            s.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = s.getGeneratedKeys();
            rs.first();

            query = "INSERT INTO contaPoupanca VALUES(" + obj.getLimite() + ", " + rs.getInt(1) + ")";
            s = con.prepareStatement(query);
            s.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(ContaPoupancaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String a[]) {
        ContaPoupancaDAO dao = new ContaPoupancaDAO();
        ContaPoupanca cp = new ContaPoupanca((long) 5, 50000.0, 100000.0);
        //dao.atualizar(cp);

        cp = dao.getByNumeroConta((long) 2);
        System.out.println(cp.mostrarDados());
        /*
        dao.inserir(cp);
        dao.listarTodos().stream().forEach(conta -> System.out.println(conta.mostrarDados()));

        cp.setNumeroConta((long) 4);
        dao.deletar(cp);
        dao.listarTodos().stream().forEach(conta -> System.out.println(conta.mostrarDados()));
         */
    }

    @Override
    public List<ContaPoupanca> listarTodos() {
        List<ContaPoupanca> lista = new ArrayList<>();
        Connection con = Conexao.getConexao();
        String query = " select contaBancaria.numeroConta, contaBancaria.saldo, contaPoupanca.limite from contaBancaria"
                + " JOIN contapoupanca"
                + " WHERE contaBancaria.numeroConta = contapoupanca.numeroConta";

        try {
            Statement s = con.prepareStatement(query);
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                lista.add(new ContaPoupanca((long) rs.getInt("numeroConta"), rs.getDouble("saldo"), rs.getDouble("limite")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContaPoupancaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    @Override
    public void deletar(ContaPoupanca obj) {
        Connection con = Conexao.getConexao();
        String query = "DELETE FROM contaPoupanca WHERE numeroConta = " + obj.getNumeroConta();

        try {
            Statement s = con.prepareStatement(query);
            s.execute(query);

            query = "DELETE FROM contaBancaria WHERE numeroConta = " + obj.getNumeroConta();
            s.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(ContaPoupancaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(ContaPoupanca obj) {
        Connection con = Conexao.getConexao();
        String query = "UPDATE contaBancaria "
                + " SET saldo = ? "
                + " WHERE numeroConta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, obj.getSaldo());
            ps.setLong(2, obj.getNumeroConta());
            ps.executeUpdate();

            query = "UPDATE contaPoupanca "
                    + " SET limite = ? "
                    + " WHERE numeroConta = ?";
            ps = con.prepareStatement(query);
            ps.setDouble(1, obj.getLimite());
            ps.setLong(2, obj.getNumeroConta());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ContaPoupancaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ContaPoupanca getByNumeroConta(Long id) {
        ContaPoupanca cp = null;
        Connection con = Conexao.getConexao();
        String query = "SELECT contaBancaria.numeroConta, contaBancaria.saldo, contaPoupanca.limite from contaBancaria "
                + " JOIN contapoupanca "
                + " WHERE contaBancaria.numeroConta = contapoupanca.numeroConta AND contaBancaria.numeroConta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.first();

            cp = new ContaPoupanca(rs.getLong("numeroConta"), rs.getDouble("saldo"), rs.getDouble("limite"));

        } catch (SQLException ex) {
            Logger.getLogger(ContaPoupancaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cp;
    }

}
