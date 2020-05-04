package com.capg.onlinewallet.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlinewallet.dao.IOnlineWalletDao;
import com.capg.onlinewallet.entities.OnlineWallet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowWalletTest {
	@Autowired
	 private IOnlineWalletService service;
	@MockBean
	private IOnlineWalletDao dao;
	@Test
	public void showBalancetest()
	{
		OnlineWallet bean = new OnlineWallet();
	      bean.setCustomerId(70);
	      bean.setAccountBalance(10000);
	      Mockito.when(dao.addAmount(bean.getCustomerId(),bean.getAccountBalance())).thenReturn(bean);
	        assertThat(service.addAmount(bean.getCustomerId(),bean.getAccountBalance())).isEqualTo(bean);
		
	}
}




