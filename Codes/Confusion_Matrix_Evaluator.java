package com.subhajeet;

import java.util.*;

public class Confusion_Matrix_Evaluator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the True Positive (TP) Value : ");
        double tp = sc.nextDouble();
        System.out.print("Enter the True Negative (TN) Value : ");
        double tn = sc.nextDouble();
        System.out.print("Enter the False Positive (FP) Value : ");
        double fp = sc.nextDouble();
        System.out.print("Enter the False Negative (FN) Value : ");
        double fn = sc.nextDouble();
        System.out.println("\n" + "----------------------------------------" + "\n");
        // Precision
        double pr = tp / (tp + fp);

        // Recall or, True Positive Rate (TPR) or, Sensitivity
        double rc = tp / (tp + fn);

        // Accuracy
        double acc = (tp + tn) / (tp + tn + fp + fn);

        // F1 Score
        double f1 = 2 * ((pr * rc) / (pr + rc));

        // Specificity or, True Negative Rate (TNR)
        double spc = tn / (tn + fp);

        // False Positive Rate(FPR) or, (1 - Specificity)
        double fpr = fp / (fp + tn);

        // False Negative Rate
        double fnr = fn / (tp + fn);

        // Positive Predictive Value or, (Precision * 100)
        double ppv = (tp / (tp + fp)) * 100;

        // Negative Predictive Value
        double npv = (tn / (tn + fn)) * 100;

        // False Discovery Rate
        double fdr = fp / (fp + tp);

        // False Omission Rate
        double fOr = fn / (fn + tn);

        System.out.print("Total Test Dataset size : " + (int)(tp + tn + fp + fn) + "\n");
        System.out.print("Precision : ");
        System.out.format("%.12f \n", pr);
        System.out.print("Recall or, True Positive Rate(TPR) or, Sensitivity  : ");
        System.out.format("%.12f \n", rc);
        System.out.print("Accuracy : ");
        System.out.format("%.12f \n", acc);
        System.out.print("F1-Score : ");
        System.out.format("%.12f \n", f1);
        System.out.print("Specificity or, True Negative Rate(TNR) : ");
        System.out.format("%.12f \n", spc);
        System.out.print("False Positive Rate(FPR) or, (1 - Specificity) : ");
        System.out.format("%.12f \n", fpr);
        System.out.print("False Negative Rate (FNR) : ");
        System.out.format("%.12f \n", fnr);
        System.out.print("False Discovery Rate : ");
        System.out.format("%.12f \n", fdr);
        System.out.print("False Omission Rate : ");
        System.out.format("%.12f \n", fOr);
        System.out.print("Positive Predictive Value or, (Precision * 100) : ");
        System.out.format("%.12f \n", ppv);
        System.out.print("Negative Predictive Value : ");
        System.out.format("%.12f \n", npv);

    }
}
