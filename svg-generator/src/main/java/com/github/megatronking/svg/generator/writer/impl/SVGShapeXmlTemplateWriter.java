package com.github.megatronking.svg.generator.writer.impl;

import com.github.megatronking.svg.generator.writer.IBufferWriter;

import java.io.BufferedWriter;
import java.io.IOException;

public class SVGShapeXmlTemplateWriter implements IBufferWriter {

    @Override
    public void write(BufferedWriter bw) throws IOException {
        bw.write("<!-- AUTO-GENERATED FILE.  DO NOT MODIFY. -->");
        bw.newLine();
        bw.write("<shape xmlns:android=\"http://schemas.android.com/apk/res/android\" />");
        // The end.
        bw.flush();
        bw.close();
    }
}
