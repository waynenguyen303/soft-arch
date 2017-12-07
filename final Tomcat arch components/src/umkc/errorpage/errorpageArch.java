package umkc.errorpage;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Context;

import umkc.IcontextOut;

public class errorpageArch extends AbstractMyxSimpleBrick implements IcontextOut
{
    public static final IMyxName msg_IcontextOut = MyxUtils.createName("umkc.IcontextOut");


	private IerrorpageImp _imp;

    public errorpageArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IerrorpageImp getImplementation(){
        try{
			return new errorpageImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_IcontextOut)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Context
    public void sendcontextToOut (Context context)   {
		_imp.sendcontextToOut(context);
    }    
}