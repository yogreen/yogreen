package com.websystem.service.spi;

import java.rmi.RemoteException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.Name;

import com.websystem.domain.WebsystemProcessStateEnum;

public interface ActionHandlerService {
	
	void bind(String name, byte[] contents)throws RemoteException;
	void clean() throws RemoteException;

	void cleanAfter(long time, TimeUnit unit)throws RemoteException;
	List<String> inputKeys() throws RemoteException;
	byte[] lookup(Name name) throws RemoteException;
	byte[] lookup(String name) throws RemoteException;
	List<String> realKeys() throws RemoteException;
	public WebsystemProcessStateEnum tryAccess() throws RemoteException;

	void unbind(String name) throws RemoteException;

}
