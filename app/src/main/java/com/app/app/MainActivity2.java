package com.app.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {
    PDFView pdfview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdfview = findViewById(R.id.pdfView);

        int pdf_position = getIntent().getIntExtra("key_position", 0);

        if (pdf_position == 0)
            pdfview.fromAsset("DSA Lecture 1-2.pdf").load();
        else if (pdf_position == 1)
            pdfview.fromAsset("DSA Lecture 3-8.pdf").load();
        else if (pdf_position == 2)
            pdfview.fromAsset("DSA Lecture 9-11.pdf").load();
        else if (pdf_position == 3)
            pdfview.fromAsset("DSA Lecture 12-14.pdf").load();
        else if (pdf_position == 4)
            pdfview.fromAsset("DSA Lecture 15-16.pdf").load();
        else if (pdf_position == 5)
            pdfview.fromAsset("DSA Lecture 17-20.pdf").load();
        else if (pdf_position == 6)
            pdfview.fromAsset("DSA Lecture 21-22.pdf").load();
        else if(pdf_position==7)
            pdfview.fromAsset("DiffCal1.pdf").load();
        else if(pdf_position==8)
            pdfview.fromAsset("DiffCal2.pdf").load();
        else if(pdf_position==9)
            pdfview.fromAsset("DiffCal3.pdf").load();
        else if(pdf_position==10)
            pdfview.fromAsset("DiffCal4.pdf").load();
        else if(pdf_position==11)
            pdfview.fromAsset("DiffCal5.pdf").load();
        else if(pdf_position==12)
            pdfview.fromAsset("Explicit and Implicit Functions.pdf").load();
        else if(pdf_position==13)
            pdfview.fromAsset("Homogeneous Functions.pdf").load();
        else if(pdf_position==14)
            pdfview.fromAsset("Jacobin.pdf").load();
        else if(pdf_position==15)
            pdfview.fromAsset("Limit &Continuity.pdf").load();
        else if(pdf_position==16)
            pdfview.fromAsset("Maxima and Minima of functions of two variables.pdf").load();
        else if(pdf_position==17)
            pdfview.fromAsset("Method of Lagrange's Multiplier.pdf").load();
        else if(pdf_position==18)
            pdfview.fromAsset("Partial Der..pdf").load();
        else if(pdf_position==19)
            pdfview.fromAsset("partial_toal derivative example.pdf").load();
        else if(pdf_position==20)
            pdfview.fromAsset("Taylor's and Maclaurin's series.pdf").load();
        else if(pdf_position==21)
            pdfview.fromAsset("Digital Circuit by Anand Kumar.pdf").load();
        else if(pdf_position==22)
            pdfview.fromAsset("DIGITAL.pdf").load();
        else if(pdf_position==23)
            pdfview.fromAsset("Lesson-04 (1).pdf").load();
        else if(pdf_position==24)
            pdfview.fromAsset("Microbiology.pdf").load();
        else if(pdf_position==25)
            pdfview.fromAsset("ENZYME 1.pdf").load();
        else if(pdf_position==26)
            pdfview.fromAsset("ENZYME 2.pdf").load();
        else if(pdf_position==27)
            pdfview.fromAsset("ENZYME 3.pdf").load();
        else if(pdf_position==28)
            pdfview.fromAsset("Enzyme reactions .pdf").load();
        else if(pdf_position==29)
            pdfview.fromAsset("Enzyme reactions 2.pdf").load();
        else if(pdf_position==30)
            pdfview.fromAsset("CHROMOSOMAL HIERARCHY.pdf").load();
        else if(pdf_position==31)
            pdfview.fromAsset("pdfcoffee.com_microelectronic-circuits-by-sedra-smith-7th-editionpdf-4-pdf-free.pdf").load();
        else if(pdf_position==32)
            pdfview.fromAsset("hyperbolic-formulas.pdf").load();
    }
}