package Controller;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class main {
//Hola
	
	public static void main(String[] args) {
		try {
			// Url con la foto
			URL url = new URL(
					"http://www.skynovels.net/read-offline/4106/1.pdf");

			// establecemos conexion
			URLConnection urlCon = url.openConnection();
			urlCon.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
			urlCon.connect();
			// Sacamos por pantalla el tipo de fichero
			//System.out.println(urlCon.getContentType());

			// Se obtiene el inputStream de la foto web y se abre el fichero
			// local.
			InputStream is = urlCon.getInputStream();
			FileOutputStream fos = new FileOutputStream("D:/prueba1.pdf");
			
			
			
			// Lectura de la foto de la web y escritura en fichero local
			byte[] array = new byte[1000]; // buffer temporal de lectura.
			int leido = is.read(array);
			while (leido > 0) {
				fos.write(array, 0, leido);
				leido = is.read(array);
			}

			// cierre de conexion y fichero.
			System.out.println("Aricho "+urlCon.getFileNameMap());
			is.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
