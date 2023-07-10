import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BubbleSort extends JPanel{
    int arr[];
    int compareIndex;
    int arrayIndex;
    String s;
    
    JPanel motionPanelHeader;
    JPanel motionPanelArrayIndex;
    JPanel motionPanelCompareIndex;
    JPanel motionPanelMotionSwap;

    JLabel motion_header;
    JLabel motion_arrayIndex;
    JLabel motion_compareIndex;
    JLabel motion_swap;
    Motion motion;

    public BubbleSort(int []arr,int arrayIndex){
        this.arr=arr;
        this.arrayIndex=arrayIndex;

        motion=new Motion();
        
       
        motion_header=new JLabel();
        motion_arrayIndex=new JLabel();
        motion_compareIndex=new JLabel();
        motion_swap=new JLabel();
 
        
        motionPanelHeader=new JPanel();
        motionPanelHeader.setBounds(500,430,700,50);
        motionPanelHeader.setBackground(Color.gray);
        motion_header.setForeground(Color.white);
        String formatHeader = motion.header().replace("\n", "<br>");
        formatHeader = "<html><font size='4'>" + formatHeader + "</font></html>";
        motion_header.setText(formatHeader);
        motionPanelHeader.add(motion_header);
       // motionPanelHeader.repaint();
        
        
       
         motionPanelArrayIndex =new JPanel();
         motionPanelArrayIndex.setBounds(500,480,700,50);
         motionPanelArrayIndex.setBackground(Color.black);
         motion_arrayIndex.setForeground(Color.white);
         String formatArrayIndex = motion.arrayIndex().replace("\n", "<br>");
         formatArrayIndex = "<html><font size='4'>" + formatArrayIndex + "</font></html>";
         motion_arrayIndex.setText(formatArrayIndex);
         motionPanelArrayIndex.add(motion_arrayIndex);

         motionPanelCompareIndex =new JPanel();
         motionPanelCompareIndex.setBounds(500,530,700,30);
         motionPanelCompareIndex.setBackground(Color.black);
         motion_compareIndex.setForeground(Color.white);
          String formatCompareIndex = motion.compareIndex().replace("\n", "<br>");
          formatCompareIndex = "<html><font size='4'>" + formatCompareIndex + "</font></html>";
          motion_compareIndex.setText(formatCompareIndex);
          motionPanelCompareIndex.add(motion_compareIndex); 

         motionPanelMotionSwap =new JPanel();
         motionPanelMotionSwap.setBounds(500,560,700,120);
         motionPanelMotionSwap.setBackground(Color.black);
         motion_swap.setForeground(Color.white);
         String formatswap = motion.swap().replace("\n", "<br>");
         formatswap = "<html><font size='4'>" + formatswap + "</font></html>";
         motion_swap.setText(formatswap);
         motionPanelMotionSwap.add(motion_swap);
        
         
    }

   String compare(){
    motionPanelHeader.setBackground(Color.black);
    motionPanelArrayIndex.setBackground(Color.black);
    motionPanelCompareIndex.setBackground(Color.black);
    motionPanelMotionSwap.setBackground(Color.black);
    
    int len=this.arr.length;
    
        if(compareIndex<len-1){
        if(this.arr[compareIndex]>this.arr[compareIndex+1]){
            s=this.arr[compareIndex]+" > "+this.arr[compareIndex+1]+" hence swap them";
            int temp=this.arr[compareIndex];
            this.arr[compareIndex]=this.arr[compareIndex+1];
            this.arr[compareIndex+1]=temp;
            motionPanelMotionSwap.setBackground(Color.gray);
            
        }
       else if(this.arr[compareIndex]<this.arr[compareIndex+1]){
            s=this.arr[compareIndex]+" < "+this.arr[compareIndex+1]+" hence no swapping";
            
        }
        else if(this.arr[compareIndex]==this.arr[compareIndex+1]){
            s=this.arr[compareIndex]+" = "+this.arr[compareIndex+1]+" hence no swapping";
        }
        compareIndex++;
        motionPanelCompareIndex.setBackground(Color.gray);
    }
   else if(arrayIndex>0){
     arrayIndex--;
     setCompareIndex(0);
     motionPanelArrayIndex.setBackground(Color.gray);
    }
   
    return s;
   }
    void setCompareIndex(int ind){
    compareIndex=ind;
    }
    
}
