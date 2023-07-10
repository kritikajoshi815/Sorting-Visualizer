import javax.swing.JPanel;
import java.awt.Color;
public class Motion extends JPanel{
    String header(){
        return "class BubbleSort {\nvoid bubbleSort(int arr[]){";
    }
    String arrayIndex(){
        return "int n = arr.length;\nfor (int i = 0; n-1 > i; i++)";
    }
    String compareIndex(){
        return "for (int j = 0; n - i - 1 > j; j++)";
    }
    String swap(){
        return "if (arr[j] > arr[j + 1]) {\n// swap arr[j+1] and arr[j]\nint temp = arr[j];\narr[j] = arr[j + 1];\narr[j + 1] = temp;\n}\n}\n";
    }
//insertion
    String headerInsertion(){
        return "void sort(int arr[])\n{\nint n = arr.length;\n";
    }
    String motionPanelInsertionKey1(){
        return "int key = arr[i];\nint j = i - 1;\n";
    }
    String motionPanelInsertionKey2(){
        return "arr[j + 1] = key;\n}\n}\n";
    }
    String InsertionArrayIndex(){
        return "for(int i = 1; i < n; ++i) {\n";
    }
    String InsertioncompareIndex(){
        return "while(j>=0 && arr[j]>key){\narr[j + 1] = arr[j];\nj = j - 1;\n}\n";
    }

    String headerSelection(){
       return "void sort(int arr[])\n{\nint n = arr.length;\n";
}
     
    String arrayIndexSelection(){
        return "for (int i = 0; n-1>i ; i++)\n{\nint min_idx = i;\n";
    }

    String compareIndexSelection(){
        return "for (int j = i+1; n>j; j++)\n";
    }

    String compareIndexSelectionContent(){
        return "if (arr[min_idx] > arr[j])\nmin_idx = j;\n";
    }
    String swapSelection(){
        return "int temp = arr[min_idx];\narr[min_idx] = arr[i];\narr[i] = temp;\n}\n}\n";
    }
}
