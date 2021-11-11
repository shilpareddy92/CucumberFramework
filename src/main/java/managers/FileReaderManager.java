package managers;

import commonLib.DataProvider;

public class FileReaderManager {

	
	private static FileReaderManager filerreadermanager= new FileReaderManager();
	private static DataProvider dataprovider;
	
	private FileReaderManager() {
		
	}
	public static FileReaderManager getInstance()
	{
		return filerreadermanager;
	}
	
	public  DataProvider getdataprovider()
	{
		return (dataprovider==null)?dataprovider =  new DataProvider():dataprovider;

	}
}
