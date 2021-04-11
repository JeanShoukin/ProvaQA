package suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;




public class Gerador {
	
	 public static String dataHoraParaArquivo(){
	        Timestamp ts = new Timestamp(System.currentTimeMillis());
	        return new SimpleDateFormat("dd-MM-yyyy G kk;mm;ss z").format(ts);
	    }
	}
