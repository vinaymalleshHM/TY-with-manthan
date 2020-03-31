package com.testyantra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.testyantra.music.MusicFilesInfoBean;

public class MusicFDAOImpl implements MusicFDAO {

	MusicFilesInfoBean musicFilesInfoBean = null;
	@Override
	public ArrayList playSong() {


		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<String> al = new ArrayList<String>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer","root","root");
			String query ="select * from MusicFiles";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			

			while (rs.next()) {
				musicFilesInfoBean = new MusicFilesInfoBean();
				//musicFilesInfoBean.setSong_ID(rs.getInt("Song_ID"));
				musicFilesInfoBean.setSong_Title(rs.getString("Song_Title"));
				al.add(musicFilesInfoBean.getSong_Title());
//				musicFilesInfoBean.setArtist_Name(rs.getString("Artist_Name"));
//				musicFilesInfoBean.setAlbum_Name(rs.getString("Album_Name"));
//				musicFilesInfoBean.setSong_Location(rs.getString("Song_Location"));
//				musicFilesInfoBean.setDescription(rs.getString("Description"));
			}


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return al;
	}
	@Override
	public MusicFilesInfoBean searchSong(String search) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer","root","root");
			String query ="select * from MusicFiles where Song_Title=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, search);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				musicFilesInfoBean = new MusicFilesInfoBean();
				musicFilesInfoBean.setSong_ID(rs.getInt("Song_ID"));
				musicFilesInfoBean.setSong_Title(rs.getString("Song_Title"));
				musicFilesInfoBean.setArtist_Name(rs.getString("Artist_Name"));
				musicFilesInfoBean.setAlbum_Name(rs.getString("Album_Name"));
				musicFilesInfoBean.setSong_Location(rs.getString("Song_Location"));
				musicFilesInfoBean.setDescription(rs.getString("Description"));
			}


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return musicFilesInfoBean;
	}
	@Override
	public boolean operationOnAddDB(MusicFilesInfoBean musicFilesInfoBean) {


		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isAdded= false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer","root","root");

			String query="insert into MusicFiles values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, musicFilesInfoBean.getSong_ID());
			pstmt.setString(2,musicFilesInfoBean.getSong_Title());
			pstmt.setString(3,musicFilesInfoBean.getArtist_Name());
			pstmt.setString(4,musicFilesInfoBean.getAlbum_Name());
			pstmt.setString(5,musicFilesInfoBean.getSong_Location());
			pstmt.setString(6,musicFilesInfoBean.getDescription());
			int n =pstmt.executeUpdate();

			if(n>0) {
				isAdded= true;

			}


		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {


			if (pstmt != null) {

				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (con != null) {

				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}
		return isAdded;
	}
	@Override
	public boolean operationOnUpDB(MusicFilesInfoBean musicFilesInfoBean) {


		Connection con = null;
		PreparedStatement pstmt = null;
		boolean  isup=false;


		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer","root","root");

			String query="update MusicFiles set Song_Title=? where Song_ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,musicFilesInfoBean.getSong_Title());
			pstmt.setInt(2, musicFilesInfoBean.getSong_ID());

			int n =pstmt.executeUpdate();
			if(n>0) {
				isup=true;
			}

		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {

			if (pstmt != null) {

				try {

					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (con != null) {

				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}


			return isup;
		}
	}
	@Override
	public boolean operationOnDelDB(MusicFilesInfoBean musicFilesInfoBean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean  isdel=false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer","root","root");
			String query="delete from MusicFiles where Song_ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,musicFilesInfoBean.getSong_ID());
			int n = pstmt.executeUpdate();

			if(n>0) {
				isdel=true;
			}


		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}



		return isdel;
	}
}

