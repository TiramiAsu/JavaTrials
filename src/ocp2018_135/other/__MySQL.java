/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.other;

/**
 * <pre>
 * [MySQL 語法] 2020-02-15 12:40
 * 1.使用 WorkBench 5.2E
 * 2.SQL 語法筆記
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public interface __MySQL {
	/*
	 # 建立資料庫
	 create database db; # 執行閃電
	 
	 # 使用資料庫
	 use db; # 旁邊字要變粗體
	 
	 # 建立 table
	  # 選取語法, 再執行閃電
	 create table Members(
	 	m_id int(11) Auto_Increment not null primary key, # 11位數
	 		# Auto_Increment: 自動增長(類似++)
	 	m_name varchar(12) not null, # 最大值255(0-255)
	 	m_email verchar(30) not null,
	 	m_note text
	 );
	 
	 # 單筆新增(8-10%)單雙引號都可以
	 insert into Members(m_name,m_email,m_note)
	 value('Tirami','xxxx@gmail.com','none');
	 
	 # 多筆新增
	 insert into Members(m_name,m_email,m_note)
	 value('TiramiD','xxx@gmail.com','none'),
	 ('Sandy','xx@gmail.com','none');
	 
	 # 更新(5-7%)
	 update Members set m_note="Members_id3_note_column" where m_id=3;
	 
	 # 刪除(5%)
	 delete from Members where m_name='Tirami'; # 這樣全部同名的都會刪去(不要這樣做)
	 delete from Members where m_id=2;          # 用 primary key 比較好

	 # 搜尋(80%)
	 select * from Members; # * 代表顯示所有欄位
	 
	 select m_name, m_email from Members; # 只顯示 2 個欄位
	 
	 select m_name as NAME, m_email as MAIL, m_note as NOTE from Members; # 將顯示欄位換個名字
	 
	 create table chart(
	 	c_id int(10) Auto_Increment not null primary key,
	 	c_sex enum('M','F') not null, # 如果輸入 MF 以外選項, 會出錯, 資料庫拒絕新增
	 	c_name verchar(30) not null
	 );
	 select * from chart;
	 
	 select * from members where m_name like '%n%'; # m_name 有 n 的都 list 出來
	 # 模糊查詢:
	  # '%f%': 只要有 f 就 list 出來
	  #  'E%': 開頭為 E
	  #  '%y': 字尾為y
	 
	 # 新增欄位:
	  # 1. 如果事後要新增欄位, not null 先不要設定(因為之前的資料一定是null)
	  # 2. 新建立一個 table, 然後兩個 table 串聯在一起(建立table-num, table Members 新增一欄 n_id 對應)
	 
	 # 新增一個 table-num (n_id int(11),n_pay decimal(9,3))
	 select * from Members join num on Members.n_id=num.n_id; # 會直接 show 兩個 table 的所有欄位
	 */
}
