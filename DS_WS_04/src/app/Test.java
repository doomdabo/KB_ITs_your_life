package app;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import common.DBManager;
import dto.UserDto;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// insert();
		//update();
		// selectAll();
		 selectOne();
		// delete();
	}

	// insert
	private static void insert() throws SQLException {
		UserDto dto = new UserDto(); // 객체 생성
		dto.setUserSeq(666);// 값 저장
		dto.setName("육길동");
		dto.setEmail("six@gildong@com");
		dto.setPhone("010-6666-6666");
		dto.setSleep(false);
		String temp; // true면 y저장, false면 n저장
		if (dto.isSleep() == true)
			temp = "Y";
		else
			temp = "N";
		try {
			Connection con = DBManager.getConnection();
			System.out.println("연결성공");

			String sql = "INSERT INTO users(user_seq,name,email,phone,is_sleep)";
			sql += "VALUES(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getUserSeq());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, temp);
			int count = pstmt.executeUpdate();
			DBManager.releaseConnection(pstmt, con);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("연결실패");
		}

	}

	// update
	private static void update() throws SQLException {
		UserDto dto = new UserDto();
		dto.setUserSeq(666);
		dto.setEmail("yook@gildong@com");
		dto.setPhone("010-7777-7777");
		dto.setSleep(true);
		String temp; // true면 y저장, false면 n저장
		if (dto.isSleep() == true)
			temp = "Y";
		else
			temp = "N";
		try {
			Connection con = DBManager.getConnection();
			System.out.println("연결성공");

			String sql = "update users set email = ?,phone = ?,is_sleep=? where user_seq = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, temp);
			pstmt.setInt(4, dto.getUserSeq());

			int count = pstmt.executeUpdate();
			DBManager.releaseConnection(pstmt, con);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}

	// select all
	private static void selectAll() {
		// 쿼리 결과 담을 리스트 생성
		List<UserDto> list = new ArrayList<>();
		try {
			Connection con = DBManager.getConnection();
			String sql = "select * from users order by user_seq desc"; // 최신글 우선
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) { // 쿼리 더이상 나오지 않을 때까지 탐색
				UserDto dto = new UserDto();
				dto.setUserSeq(rs.getInt("user_seq"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhone(rs.getString("phone"));
				if (rs.getString("is_sleep") == "Y")
					dto.setSleep(true);
				else
					dto.setSleep(false);
				list.add(dto);// 결과 리스트에 담기
			}
			DBManager.releaseConnection(pstmt, con);
		} catch (Exception e) {
			e.printStackTrace();
		} // 오류나면 trace
		for (UserDto userDto : list) {
			System.out.println(userDto);
		}
	}

	// select one
	private static void selectOne() {
		int userSeq = 666;
		UserDto dto = null;
		try {
			Connection con = DBManager.getConnection();
			String sql = "select * from users where user_seq = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userSeq);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new UserDto();
				dto.setUserSeq(userSeq);
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhone(rs.getString("phone"));
				if (rs.getString("is_sleep") == "Y")
					dto.setSleep(true);
				else
					dto.setSleep(false);
			}
			System.out.println(dto);
			DBManager.releaseConnection(pstmt, con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete 구현
	private static void delete() {
		int userSeq = 666;
		try {
			Connection con = DBManager.getConnection();
			String sql = "delete from users where user_seq = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userSeq);
			int count = pstmt.executeUpdate();

			DBManager.releaseConnection(pstmt, con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
