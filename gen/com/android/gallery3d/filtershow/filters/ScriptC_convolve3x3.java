/*
 * Copyright (C) 2011-2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /home/raowei/other/Gallery2/src/com/android/gallery3d/filtershow/filters/convolve3x3.rs
 */
package com.android.gallery3d.filtershow.filters;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_convolve3x3 extends ScriptC {
    private static final String __rs_resource_name = "convolve3x3";
    // Constructor
    public  ScriptC_convolve3x3(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_convolve3x3(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_gWidth = 0;
    private int mExportVar_gWidth;
    public synchronized void set_gWidth(int v) {
        setVar(mExportVarIdx_gWidth, v);
        mExportVar_gWidth = v;
    }

    public int get_gWidth() {
        return mExportVar_gWidth;
    }

    private final static int mExportVarIdx_gHeight = 1;
    private int mExportVar_gHeight;
    public synchronized void set_gHeight(int v) {
        setVar(mExportVarIdx_gHeight, v);
        mExportVar_gHeight = v;
    }

    public int get_gHeight() {
        return mExportVar_gHeight;
    }

    private final static int mExportVarIdx_gPixels = 2;
    private Allocation mExportVar_gPixels;
    public void bind_gPixels(Allocation v) {
        mExportVar_gPixels = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gPixels);
        else bindAllocation(v, mExportVarIdx_gPixels);
    }

    public Allocation get_gPixels() {
        return mExportVar_gPixels;
    }

    private final static int mExportVarIdx_gIn = 3;
    private Allocation mExportVar_gIn;
    public synchronized void set_gIn(Allocation v) {
        setVar(mExportVarIdx_gIn, v);
        mExportVar_gIn = v;
    }

    public Allocation get_gIn() {
        return mExportVar_gIn;
    }

    private final static int mExportVarIdx_gCoeffs = 4;
    private float[] mExportVar_gCoeffs;
    public synchronized void set_gCoeffs(float[] v) {
        mExportVar_gCoeffs = v;
        FieldPacker fp = new FieldPacker(36);
        for (int ct1 = 0; ct1 < 9; ct1++) {
            fp.addF32(v[ct1]);
        }

        setVar(mExportVarIdx_gCoeffs, fp);
    }

    public float[] get_gCoeffs() {
        return mExportVar_gCoeffs;
    }

}

