package com.capg.onlinewallet.dao;

import java.util.List;

import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.entities.TransferBean;

public interface IOnlineWalletDao {

	public OnlineWallet CreateOnlineWallet(OnlineWallet onlinewalletbean);

	public OnlineWallet findOnlineWalletById(int customerId);

	public OnlineWallet updateOnlineWallet(OnlineWallet onlinewalletbean);

	public List<OnlineWallet> findAllOnlineWallets();

	public OnlineWallet deposit(TransferBean transferBean);

	public OnlineWallet addAmount(int customerId, int amount);
}
