//Programa por Hugo Gonzalez
//sd

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import static java.lang.Thread.sleep;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ColorPicker {
	static int cont=0;
	//Primer Cambio
    public static void main(String[] args) throws InterruptedException {
    Color color;
	
	int numSaltosx=80;
	int numSaltosy=70;
        try {//134-189-255
            //198 224 255
            List acumi = new ArrayList();List acumj = new ArrayList();
            Robot robot = new Robot();
            if((KeyEvent.VK_J)>1){
				System.out.println("Pausa");
			}
			Scanner T=new Scanner(System.in);
			
            String s="";
			//A los 20 empieza con 6
            while(true){
				/*System.out.println("Esperando...");
				s=T.nextLine();
				if(s.equals("")){
				*/	//33,41,61
				
                for (int i=500; i<859;i+=numSaltosx){
                    for (int j=173; j<538;j+=numSaltosy){
                        color = robot.getPixelColor(i, j);
                        //if (color.getRed()==255){
                            //   color.get
							
                                if (color.getBlue()==255){
									System.out.println("x :"+i+"    y: "+j);
									acumi.add(i);
									acumj.add(j);	
                                }
								
								if(cont>7){
									numSaltosx=50;
									numSaltosy=50;
									if (j>470){
										numSaltosy=80;
									}else{
										numSaltosy=50;
									}
									if(i>740){
										numSaltosx=80;
									}else{
										numSaltosx=50;
									}
								}
								if (cont>19){
									numSaltosx=50;
									numSaltosy=50;
									if (j>400){
										numSaltosy=50;
									}else{
										numSaltosy=50;
									}
									if(i>740){
										numSaltosx=40;
									}else{
										numSaltosx=50;
									}
									if (i<550){
										numSaltosx=40;
									}
									
								}
								if(cont>33){
									numSaltosx=51;
									numSaltosy=50;
									if (i<546){
										numSaltosx=40;
									}else{
										numSaltosx=51;
									}
									if (j<208){
										numSaltosy=34;
									}else{
										numSaltosy=50;
									}
								}
								if (color.getRed()==33 || color.getRed()==1 || color.getRed()==2 || color.getRed()==33 || color.getRed()==49){
									if (color.getGreen()==41 || color.getGreen()==249 || color.getGreen()==42 || color.getGreen()==40 || color.getGreen()==239){
										if(color.getBlue()==61 || color.getBlue()==249 || color.getBlue()==6 || color.getBlue()==62 || color.getBlue()==78){
											System.out.println("reset");
											
											//robot.mouseMove(600, 360);
											sleep(1000);
											i=456;
											j=190;
										}
									}
								}
                        //}
                        
                    }
                }
                 sleep(1000);
                    for (int x=0;x<acumj.size();x++){
					//	for(int z=0;z<acumi.size();z++){
						//	if((int)acumi.get(x)!=(int)acumi.get(z) && (int)acumj.get(x)!=(int)acumj.get(z)){
							System.out.println("Mouse  x:"+ acumi.get(x)+"   Y:"+acumj.get(x));
							robot.mouseMove((int)acumi.get(x),(int)acumj.get(x));   
							robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
							sleep(100);
							//}
					//	}
                    }
                    sleep(1500);
                    acumi.clear();
                    acumj.clear();
					cont++;
					System.out.println(cont);
				}
            //}
			
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}