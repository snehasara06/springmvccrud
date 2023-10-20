package com.kgisl.springmvccrud;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LaptopDAO {

    {
        System.out.println("hiii");
    }
    
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Laptop lap) {
        String sql="insert into laptop(name,color,price) values('"+lap.getName()+"','"+lap.getColor()+"',"+lap.getPrice()+")";    
       //String sql = "INSERT INTO laptop (name, color, price) VALUES (?, ?, ?)";
       
       // return template.update(sql, lap.getName(), lap.getColor(), lap.getPrice());
        return template.update(sql);
    }
    

    public int update(Laptop lap) {
        //String sql = "UPDATE laptop SET name=?, color=?, price=? WHERE id=?";
        String sql="update laptop set name='"+lap.getName()+"', color='"+lap.getColor()+"',price="+lap.getPrice()+" where id="+lap.getId()+"";
        //return template.update(sql, lap.getName(), lap.getColor(), lap.getPrice(), lap.getId());
        return template.update(sql);
    }

    
    public int delete(int id)
    {
        String sql="delete from laptop where id ="+id+" ";
        return template.update(sql);
    }
    
    public Laptop getLaptopById(int id)
    {
        String sql="select * from laptop where id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Laptop>(Laptop.class));
    }

    public List<Laptop> getLaptops()
    {
          return template.query("select * from laptop", new RowMapper<Laptop>(){
            public Laptop mapRow(ResultSet rs, int row) throws SQLException{
                Laptop lap=new Laptop();
                lap.setId(rs.getInt(1));
                lap.setName(rs.getString(2));
                lap.setColor(rs.getString(3));
                lap.setPrice(rs.getFloat(4));

                return lap;
            }
          });
    }

}