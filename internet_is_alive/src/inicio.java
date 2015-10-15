import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;




public class inicio {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		
		Internet_available frame = new Internet_available();
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		
		///
		  if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
                
        Image iconImage;
		try {
				iconImage = ImageIO.read(new File("images\\icon.gif"));
			
				final TrayIcon trayIcon = new TrayIcon(iconImage, "tray icon");
	       
	        final SystemTray tray = SystemTray.getSystemTray();
	   
	        // Create a pop-up menu components
	     //   MenuItem aboutItem = new MenuItem("About");
	     //   CheckboxMenuItem cb1 = new CheckboxMenuItem("Set auto size");
	     //   CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
	    //    Menu displayMenu = new Menu("Display");
	     //   MenuItem errorItem = new MenuItem("Error");
	     //   MenuItem warningItem = new MenuItem("Warning");
	    //    MenuItem infoItem = new MenuItem("Info");
	     //   MenuItem noneItem = new MenuItem("None");
	        MenuItem exitItem = new MenuItem("Exit");
	        
	        //Add components to pop-up menu
	    //    popup.add(aboutItem);
	    //    popup.addSeparator();
	     //   popup.add(cb1);
	    //    popup.add(cb2);
	    //    popup.addSeparator();
	     //   popup.add(displayMenu);
	     //   displayMenu.add(errorItem);
	     //   displayMenu.add(warningItem);
	     //   displayMenu.add(infoItem);
	    //    displayMenu.add(noneItem);
	        popup.add(exitItem);
	       trayIcon.setImageAutoSize(true);
	      trayIcon.setPopupMenu(popup);
	       
	      tray.add(trayIcon);
	      
	      ActionListener listener = new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                MenuItem item = (MenuItem)e.getSource();
	                //TrayIcon.MessageType type = null;
	                System.out.println(item.getLabel());
	                if ("Error".equals(item.getLabel())) {
	                    //type = TrayIcon.MessageType.ERROR;
	                    trayIcon.displayMessage("Sun TrayIcon Demo",
	                            "This is an error message", TrayIcon.MessageType.ERROR);
	                     
	                } else if ("Warning".equals(item.getLabel())) {
	                    //type = TrayIcon.MessageType.WARNING;
	                    trayIcon.displayMessage("Sun TrayIcon Demo",
	                            "This is a warning message", TrayIcon.MessageType.WARNING);
	                     
	                } else if ("Info".equals(item.getLabel())) {
	                    //type = TrayIcon.MessageType.INFO;
	                    trayIcon.displayMessage("Sun TrayIcon Demo",
	                            "This is an info message", TrayIcon.MessageType.INFO);
	                     
	                } else if ("None".equals(item.getLabel())) {
	                    //type = TrayIcon.MessageType.NONE;
	                    trayIcon.displayMessage("Sun TrayIcon Demo",
	                            "This is an ordinary message", TrayIcon.MessageType.NONE);
	                }
	            }
	        };
	         
	       
	         
	        exitItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                tray.remove(trayIcon);
	                System.exit(0);
	            }
	        });
	      
	      
	      
	      
	      
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
        }
		 
		 
		
		
		
		// 
		 
		//String Web = "http://www.yahoo.com" ;
		//String Web = "http://www.yahoo.com" ;
		String Web = "http://www.sarenet.es" ;
	int espera_int = 300000;
		//int espera_int = 10000;
	
		String espera = String.valueOf(espera_int/(1000*60));
		int bucle =1;
		int code= 0;
		frame.textField.setText(Web);
		frame.textField_1.setText(espera);
		while (bucle == 1){	
			
		code = 0;
			try {
				System.out.println("nuevo bucle");
				Thread.sleep(espera_int);
			//	Thread.sleep(300000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			internet_is_alive nuevo_test = new internet_is_alive();
			 code =  nuevo_test.Is_alive(Web);
			
			if (code == 200 ){
				frame.panel.setBackground(Color.GREEN);
				frame.textField_2.setText(String.valueOf("El sistema funciona correctamente. CODIGO: " + code));
				// frame.setState ( Internet_available.NORMAL );
			}else{
				frame.panel.setBackground(Color.RED);
				 frame.setState ( Internet_available.NORMAL );

				Toolkit.getDefaultToolkit().beep();
				frame.textField_2.setText(String.valueOf("El sistema NO funciona correctamente ERROR DE INTERNET. CODIGO: " + code));
				
				
				do{
					try {
						Thread.sleep(1000);
						frame.panel.setBackground(Color.ORANGE);
						Thread.sleep(1000);
					frame.panel.setBackground(Color.RED);
					Toolkit.getDefaultToolkit().beep();
					internet_is_alive nuevo_test2 = new internet_is_alive();
					code =nuevo_test2.Is_alive(Web);
					frame.textField_2.setText(String.valueOf("El sistema NO funciona correctamente ERROR DE INTERNET.... " + code));
					} catch (InterruptedException e) {
						System.out.println("error");// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}while (code != 200);
				
				
			} 
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}
	
	
	
	 
	
	
	
	
	
	

}
