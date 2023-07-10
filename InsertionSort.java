import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class InsertionSort extends JPanel{

     int[] array;
     int array_index;
     int compare_index;
     int key;
     int len;
     boolean startOfIteration = false;
     String s;
        
        JPanel motionPanelHeader;
        JPanel motionPanelArrayIndex;
        JPanel motionPanelCompareIndex;
        JPanel motionPanelKey1;
        JPanel motionPanelKey2;
    
        JLabel motion_header;
        JLabel motion_arrayIndex;
        JLabel motion_compareIndex;
        JLabel motion_key1;
        JLabel motion_key2;

        Motion motion;
    
        public InsertionSort(int []array,int len){
            this.array=array;
            this.array_index=1;
            this.len=len;

            motion=new Motion();
            
           
            motion_header=new JLabel();
            motion_arrayIndex=new JLabel();
            motion_compareIndex=new JLabel();
            motion_key1=new JLabel();
            motion_key2=new JLabel();
     
            
            motionPanelHeader=new JPanel();
            motionPanelHeader.setBounds(500,430,700,370);
            motionPanelHeader.setBackground(Color.gray);
            motion_header.setForeground(Color.white);
            String formatHeader = motion.headerInsertion().replace("\n", "<br>");
            formatHeader = "<html><font size='4'>" + formatHeader + "</font></html>";
            motion_header.setText(formatHeader);
            motionPanelHeader.add(motion_header);
            motion_header.setHorizontalAlignment(JTextField.LEFT);
           // motionPanelHeader.repaint();
            
            
           
             motionPanelArrayIndex =new JPanel();
             motionPanelArrayIndex.setBounds(500,480,700,50);
             motionPanelArrayIndex.setBackground(Color.black);
             motion_arrayIndex.setForeground(Color.white);
             String formatArrayIndex = motion.InsertionArrayIndex().replace("\n", "<br>");
             formatArrayIndex = "<html><font size='4'>" + formatArrayIndex + "</font></html>";
             motion_arrayIndex.setText(formatArrayIndex);
             motionPanelArrayIndex.add(motion_arrayIndex);
    
             motionPanelKey1 =new JPanel();
             motionPanelKey1.setBounds(500,560,700,120);
             motionPanelKey1.setBackground(Color.black);
             motion_key1.setForeground(Color.white);
             String formatkey1 = motion.motionPanelInsertionKey1().replace("\n", "<br>");
             formatkey1 = "<html><font size='4'>" + formatkey1 + "</font></html>";
             motion_key1.setText(formatkey1);
             motionPanelKey1.add(motion_key1);

             motionPanelCompareIndex =new JPanel();
             motionPanelCompareIndex.setBounds(500,530,700,30);
             motionPanelCompareIndex.setBackground(Color.black);
             motion_compareIndex.setForeground(Color.white);
              String formatCompareIndex = motion.InsertioncompareIndex().replace("\n", "<br>");
              formatCompareIndex = "<html><font size='4'>" + formatCompareIndex + "</font></html>";
              motion_compareIndex.setText(formatCompareIndex);
              motionPanelCompareIndex.add(motion_compareIndex); 
    
            

             motionPanelKey2 =new JPanel();
             motionPanelKey2.setBounds(500,560,700,120);
             motionPanelKey2.setBackground(Color.black);
             motion_key2.setForeground(Color.white);
             String formatkey2 = motion.motionPanelInsertionKey2().replace("\n", "<br>");
             formatkey2 = "<html><font size='4'>" + formatkey2 + "</font></html>";
             motion_key2.setText(formatkey2);
             motionPanelKey2.add(motion_key2);
             
        }

    
        String compare() {
            motionPanelHeader.setBackground(Color.black);            motionPanelArrayIndex.setBackground(Color.black);
            motionPanelCompareIndex.setBackground(Color.black);
            motionPanelKey1.setBackground(Color.black);
            motionPanelKey2.setBackground(Color.black);
            if (startOfIteration == false) {
                key = array[array_index];
                compare_index = array_index - 1;
                startOfIteration = true;
               // s="key="+key+" compare_index="+compare_index;
                s="key="+array[array_index];
                motionPanelKey1.setBackground(Color.gray);
                motionPanelKey2.setBackground(Color.gray);
               // System.out.println(s);
               return s;
            }
    
            if (compare_index >= 0 && array[compare_index] > key) {
                
                array[compare_index + 1] = array[compare_index];
                s=array[compare_index]+" > "+ key+" hence shift";
                compare_index--;
                motionPanelCompareIndex.setBackground(Color.gray);
                
             //   System.out.println(s+" compare_index="+compare_index);
              //  return array;
            }
            else {
                array[compare_index + 1] = key;
                array_index++;
                if(array_index+1<len){
                
                motionPanelArrayIndex.setBackground(Color.gray);
              //  System.out.println(s+" array_index="+array_index);
                }
                startOfIteration = false;
            }
            return s;
        }
}
