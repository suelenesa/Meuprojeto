/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Stech.dal;

import java.sql.*;

/**
 *
 * @author suele
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector() {

        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver 
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = " ";

        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            //a linha abaixo serve de apoio pra esclarecer o erro de conexão
            System.out.println(e);       
            return null;
        }
    }
}
