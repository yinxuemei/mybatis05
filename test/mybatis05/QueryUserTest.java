package mybatis05;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bfw.domain.UserInfo;
import com.bfw.mapper.UserInfoMapper;
import com.bfw.utils.DBFactory;

public class QueryUserTest {

	
	@Test
	public void query(){
		SqlSession session = DBFactory.getSession();
		
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		
		List<UserInfo> list = mapper.getAlluser(null);
		
		for(UserInfo user:list){
			System.out.println(user);
		}	
	}
	
	@Test
	public void query1(){
		SqlSession session = DBFactory.getSession();
		
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = new UserInfo();
		user.setUserId(1);
		user.setUsername("悟空");
		
		
		List<UserInfo> list = mapper.getAlluser1(user);
		
		for(UserInfo puser:list){
			System.out.println(puser);
		}	
	}
	
	@Test
	public void query2(){
		SqlSession session = DBFactory.getSession();
		
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = new UserInfo();
		//user.setUserId(1);
		//user.setUsername("悟空");
		
		
		List<UserInfo> list = mapper.getAlluser2(user);
		
		for(UserInfo puser:list){
			System.out.println(puser);
		}	
	}
	
	
	@Test
	public void query3(){
		SqlSession session = DBFactory.getSession();
		
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = new UserInfo();
		user.setUserId(1);
		user.setUsername("悟空");
		
		
		List<UserInfo> list = mapper.getAlluser3(user);
		
		for(UserInfo puser:list){
			System.out.println(puser);
		}	
	}
	
	
	@Test
	public void query4(){
		SqlSession session = DBFactory.getSession();
		
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = new UserInfo();
		user.setUserId(1);
		user.setUsername("悟空");
		
		
		List<UserInfo> list = mapper.getAlluser4(user);
		
		for(UserInfo puser:list){
			System.out.println(puser);
		}	
	}
	
	
	@Test
	public void update(){
		SqlSession session = DBFactory.getSession();
		
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = new UserInfo();
		user.setUserId(1);
		user.setUsername("悟空");
		user.setUserAge(18);
		
		int i = mapper.updateUser(user);
		session.close();
		if(i>0){
			System.out.println("修改成功！");
		}
		session.close();
	}
}
