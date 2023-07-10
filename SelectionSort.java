import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectionSort {
    int array_index, compare_index, min_idx, len;
    int[] array;
    boolean findingMin;
    String s;

    JPanel motionPanelHeader;
    JPanel motionPanelArrayIndex;
    JPanel motionPanelCompareIndex;
    JPanel motionPanelMotionSwap;
    JPanel motionPanelCompareIndexContents;

    JLabel motion_header;
    JLabel motion_arrayIndex;
    JLabel motion_compareIndex;
    JLabel motion_compareIndexContents;
    JLabel motion_swap;
    Motion motion;

    public SelectionSort(int[] array, int len) {
        this.array = array;
        this.len=len;
        array_index = 0;
        compare_index = 1;
        min_idx = 0;
        findingMin = false;

        motion=new Motion();
        
       
        motion_header=new JLabel();
        motion_arrayIndex=new JLabel();
        motion_compareIndex=new JLabel();
        motion_swap=new JLabel();
        motion_compareIndexContents=new JLabel();
 
        
        motionPanelHeader=new JPanel();
        motionPanelHeader.setBounds(500,430,700,50);
        motionPanelHeader.setBackground(Color.gray);
        motion_header.setForeground(Color.white);
        String formatHeader = motion.headerSelection().replace("\n", "<br>");
        formatHeader = "<html><font size='4'>" + formatHeader + "</font></html>";
        motion_header.setText(formatHeader);
        motionPanelHeader.add(motion_header);

        motionPanelArrayIndex =new JPanel();
        motionPanelArrayIndex.setBounds(500,480,700,50);
        motionPanelArrayIndex.setBackground(Color.black);
        motion_arrayIndex.setForeground(Color.white);
        String formatArrayIndex = motion.arrayIndexSelection().replace("\n", "<br>");
        formatArrayIndex = "<html><font size='4'>" + formatArrayIndex + "</font></html>";
        motion_arrayIndex.setText(formatArrayIndex);
        motionPanelArrayIndex.add(motion_arrayIndex);

        motionPanelCompareIndex =new JPanel();
        motionPanelCompareIndex.setBounds(500,530,700,30);
        motionPanelCompareIndex.setBackground(Color.black);
        motion_compareIndex.setForeground(Color.white);
         String formatCompareIndex = motion.compareIndexSelection().replace("\n", "<br>");
         formatCompareIndex = "<html><font size='4'>" + formatCompareIndex + "</font></html>";
         motion_compareIndex.setText(formatCompareIndex);
         motionPanelCompareIndex.add(motion_compareIndex); 

        motionPanelMotionSwap =new JPanel();
        motionPanelMotionSwap.setBounds(500,560,700,120);
        motionPanelMotionSwap.setBackground(Color.black);
        motion_swap.setForeground(Color.white);
        String formatswap = motion.swapSelection().replace("\n", "<br>");
        formatswap = "<html><font size='4'>" + formatswap + "</font></html>";
        motion_swap.setText(formatswap);
        motionPanelMotionSwap.add(motion_swap);
       // motionPanelHeader.repaint();

       motionPanelCompareIndexContents =new JPanel();
       motionPanelCompareIndexContents.setBounds(500,560,700,120);
       motionPanelCompareIndexContents.setBackground(Color.black);
       motion_compareIndexContents.setForeground(Color.white);//label
        String CompareIndexContents = motion.compareIndexSelectionContent().replace("\n", "<br>");
        CompareIndexContents = "<html><font size='4'>" + CompareIndexContents + "</font></html>";
        motion_compareIndexContents.setText(CompareIndexContents);
        motionPanelCompareIndexContents.add(motion_compareIndexContents);
    }

    public void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        motionPanelMotionSwap.setBackground(Color.gray);
    }

    public String compare() {
        motionPanelHeader.setBackground(Color.black);
    motionPanelArrayIndex.setBackground(Color.black);
    motionPanelCompareIndex.setBackground(Color.black);
    motionPanelCompareIndexContents.setBackground(Color.black);
    motionPanelMotionSwap.setBackground(Color.black);

        if (findingMin == false) {
            min_idx = array_index;
            findingMin = true;
            motionPanelArrayIndex.setBackground(Color.gray);
            s="min ="+array[array_index];
            return s;
        }

        if (array[compare_index] < array[min_idx]) {
            min_idx = compare_index;
            s="min_idx ="+array[compare_index];
            motionPanelCompareIndexContents.setBackground(Color.gray);
            return s;
        }
         
        motionPanelCompareIndexContents.setBackground(Color.gray);
        compare_index++;

        if (compare_index >= len) {
            swap(array, min_idx, array_index);
            s="swap "+array[min_idx]+" , "+array[array_index];
            array_index++;
            compare_index = array_index + 1;
            findingMin = false;
        }
       return s;
      //  return array;
    }

}
