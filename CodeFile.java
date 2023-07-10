public class CodeFile extends Panel {
    String getBubble(){
        return("ALGORITHM:\nclass BubbleSort {\nvoid bubbleSort(int arr[])\n{\nint n = arr.length;\nfor (int i = 0; n-1>i; i++)\nfor (int j = 0;n-i-1>j; j++)\nif (arr[j] > arr[j + 1]) {\n// swap arr[j+1] and arr[j]\nint temp = arr[j];\narr[j] = arr[j + 1];\narr[j + 1] = temp;\n}\n}\n");
    }
    String getInsertion(){
        return("ALGORITHM:\nvoid sort(int arr[])\n{\nint n = arr.length;\nfor (int i = 1; n>i; ++i) {\nint key = arr[i];\nint j = i - 1;\nwhile (j >= 0 && arr[j] > key) {\narr[j + 1] = arr[j];\nj = j - 1;\n}\narr[j + 1] = key;\n}\n}\n");
    }
    String getSelection(){
        return "ALGORITHM:\nvoid sort (int  arr[] )\n{\nint n = arr.length;\nfor (int i = 0; n-1>i ; i++)\n{\nint min_idx = i;\nfor (int j = i+1; n>j; j++)\nif (arr[min_idx] > arr[j])\nmin_idx = j;\nint temp = arr[min_idx];\narr[min_idx] = arr[i];\narr[i] = temp;\n}\n}\n";
    }

}