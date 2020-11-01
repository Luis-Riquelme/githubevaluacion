/**
 * 
 */
package PruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import net.javaguides.login.bean.LoginBean;
import net.javaguides.login.database.LoginDao;

/**
 * @author luis miguel
 *
 */
public class LoginPruebas 
{

	@Test
	public void Caso1_usuario_contrasenha_correcto() throws ClassNotFoundException 
	{
		boolean resultado;
		boolean esperado=true;
		
		LoginBean aa = new LoginBean();
		aa.setUsername("luis");
		aa.setPassword("123");
		
		LoginDao bb = new LoginDao();
		resultado = bb.validate(aa);	
		Assert.assertEquals(esperado, resultado);

	}

	@Test
	public void Caso2_usuario_contrasenha_incorrecto() throws ClassNotFoundException 
	{
		boolean resultado;
		boolean esperado=false;
		
		LoginBean aa = new LoginBean();
		aa.setUsername("sdfsdfds");
		aa.setPassword("sdfsdf");
		
		LoginDao bb = new LoginDao();
		resultado = bb.validate(aa);	
		Assert.assertEquals(esperado, resultado);

	}
	
	@Test
	public void Caso3_valores_vacios() throws ClassNotFoundException 
	{
		boolean resultado;
		boolean esperado=false;
		
		LoginBean aa = new LoginBean();
		aa.setUsername("");
		aa.setPassword("");
		
		LoginDao bb = new LoginDao();
		resultado = bb.validate(aa);	
		Assert.assertEquals(esperado, resultado);
	}	
}
