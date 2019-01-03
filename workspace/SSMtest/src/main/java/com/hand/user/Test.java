package com.hand.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
// 加载数据库驱动  com.mysql.jdbc.Driver
		String driver = "com.mysql.jdbc.Driver";
// 获取mysql连接地址
		String url = "jdbc:mysql://localhost:3306/yiibaidb?autoReconnect=true&useSSL=false&zeroDateTimeBehavior=convertToNull";
// 数据名称
		String username = "root";
// 数据库密码
		String password = "123=123";
// 获取一个数据的连接
		Connection conn = null;
// 获取连接的一个状态
		try {
			Class.forName(driver); 
//getConnection()方法，连接MySQL数据库！
			conn = DriverManager.getConnection(url, username, password);
			if (!conn.isClosed())
				System.out.println("数据库连接成功！");
//创建statement类对象，用来执行SQL语句！
			Statement Statement = conn.createStatement();
//要执行的SQL语句
			String sql = "select * from users";
//ResultSet类，用来存放获取的结果集！
			ResultSet rs = Statement.executeQuery(sql);
			System.out.println("-------------------------------");
			System.out.println("执行结果如下所示:");
			System.out.println("-------------------------------");
			System.out.println("学号" + "\t" + "姓名" + "\t");
			System.out.println("-------------------------------");
			String id = null;
			String name = null;
			while (rs.next()) {
				// 获取‘学号’这列数据
				id = rs.getString("username");
				// 获取‘姓名’这列数据
				name = rs.getString("password");
				// 输出结果
				System.out.println(id + "\t" + name + "\t");
			}
			rs.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// 数据库驱动类异常处理
			System.out.println("数据库驱动加载失败！");
			e.printStackTrace();
		} catch (SQLException e1) {
			// 数据库连接失败异常处理
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			System.out.println("-------------------------------");
			System.out.println("数据库数据获取成功！");
		}
	}
}
