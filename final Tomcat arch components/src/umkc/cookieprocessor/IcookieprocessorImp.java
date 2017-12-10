package umkc.cookieprocessor;


import org.apache.catalina.Context;

import umkc.cookieprocessor.cookieprocessorArch;

public interface IcookieprocessorImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (cookieprocessorArch arch);
	public cookieprocessorArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
  
    //To be imported: Context
    public void sendcontextToOut (Context context)  ;        
}