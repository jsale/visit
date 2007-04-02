// ****************************************************************************
//
// Copyright (c) 2000 - 2007, The Regents of the University of California
// Produced at the Lawrence Livermore National Laboratory
// All rights reserved.
//
// This file is part of VisIt. For details, see http://www.llnl.gov/visit/. The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or materials provided with the distribution.
//  - Neither the name of the UC/LLNL nor  the names of its contributors may be
//    used to  endorse or  promote products derived from  this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED.  IN  NO  EVENT  SHALL  THE  REGENTS  OF  THE  UNIVERSITY OF
// CALIFORNIA, THE U.S.  DEPARTMENT  OF  ENERGY OR CONTRIBUTORS BE  LIABLE  FOR
// ANY  DIRECT,  INDIRECT,  INCIDENTAL,  SPECIAL,  EXEMPLARY,  OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ****************************************************************************

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: ElevateAttributes
//
// Purpose:
//    Attributes for the elevate operator
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Tue Feb 1 11:37:31 PDT 2005
//
// Modifications:
//   
// ****************************************************************************

public class ElevateAttributes extends AttributeSubject implements Plugin
{
    // Enum values
    public final static int SCALING_LINEAR = 0;
    public final static int SCALING_LOG = 1;
    public final static int SCALING_SKEW = 2;

    public final static int LIMITSMODE_ORIGINALDATA = 0;
    public final static int LIMITSMODE_CURRENTPLOT = 1;


    public ElevateAttributes()
    {
        super(9);

        useXYLimits = false;
        limitsMode = LIMITSMODE_ORIGINALDATA;
        scaling = SCALING_LINEAR;
        skewFactor = 1;
        minFlag = false;
        min = 0;
        maxFlag = false;
        max = 1;
        variable = new String("default");
    }

    public ElevateAttributes(ElevateAttributes obj)
    {
        super(9);

        useXYLimits = obj.useXYLimits;
        limitsMode = obj.limitsMode;
        scaling = obj.scaling;
        skewFactor = obj.skewFactor;
        minFlag = obj.minFlag;
        min = obj.min;
        maxFlag = obj.maxFlag;
        max = obj.max;
        variable = new String(obj.variable);

        SelectAll();
    }

    public boolean equals(ElevateAttributes obj)
    {
        // Create the return value
        return ((useXYLimits == obj.useXYLimits) &&
                (limitsMode == obj.limitsMode) &&
                (scaling == obj.scaling) &&
                (skewFactor == obj.skewFactor) &&
                (minFlag == obj.minFlag) &&
                (min == obj.min) &&
                (maxFlag == obj.maxFlag) &&
                (max == obj.max) &&
                (variable == obj.variable));
    }

    public String GetName() { return "Elevate"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetUseXYLimits(boolean useXYLimits_)
    {
        useXYLimits = useXYLimits_;
        Select(0);
    }

    public void SetLimitsMode(int limitsMode_)
    {
        limitsMode = limitsMode_;
        Select(1);
    }

    public void SetScaling(int scaling_)
    {
        scaling = scaling_;
        Select(2);
    }

    public void SetSkewFactor(double skewFactor_)
    {
        skewFactor = skewFactor_;
        Select(3);
    }

    public void SetMinFlag(boolean minFlag_)
    {
        minFlag = minFlag_;
        Select(4);
    }

    public void SetMin(double min_)
    {
        min = min_;
        Select(5);
    }

    public void SetMaxFlag(boolean maxFlag_)
    {
        maxFlag = maxFlag_;
        Select(6);
    }

    public void SetMax(double max_)
    {
        max = max_;
        Select(7);
    }

    public void SetVariable(String variable_)
    {
        variable = variable_;
        Select(8);
    }

    // Property getting methods
    public boolean GetUseXYLimits() { return useXYLimits; }
    public int     GetLimitsMode() { return limitsMode; }
    public int     GetScaling() { return scaling; }
    public double  GetSkewFactor() { return skewFactor; }
    public boolean GetMinFlag() { return minFlag; }
    public double  GetMin() { return min; }
    public boolean GetMaxFlag() { return maxFlag; }
    public double  GetMax() { return max; }
    public String  GetVariable() { return variable; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(useXYLimits);
        if(WriteSelect(1, buf))
            buf.WriteInt(limitsMode);
        if(WriteSelect(2, buf))
            buf.WriteInt(scaling);
        if(WriteSelect(3, buf))
            buf.WriteDouble(skewFactor);
        if(WriteSelect(4, buf))
            buf.WriteBool(minFlag);
        if(WriteSelect(5, buf))
            buf.WriteDouble(min);
        if(WriteSelect(6, buf))
            buf.WriteBool(maxFlag);
        if(WriteSelect(7, buf))
            buf.WriteDouble(max);
        if(WriteSelect(8, buf))
            buf.WriteString(variable);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetUseXYLimits(buf.ReadBool());
                break;
            case 1:
                SetLimitsMode(buf.ReadInt());
                break;
            case 2:
                SetScaling(buf.ReadInt());
                break;
            case 3:
                SetSkewFactor(buf.ReadDouble());
                break;
            case 4:
                SetMinFlag(buf.ReadBool());
                break;
            case 5:
                SetMin(buf.ReadDouble());
                break;
            case 6:
                SetMaxFlag(buf.ReadBool());
                break;
            case 7:
                SetMax(buf.ReadDouble());
                break;
            case 8:
                SetVariable(buf.ReadString());
                break;
            }
        }
    }


    // Attributes
    private boolean useXYLimits;
    private int     limitsMode;
    private int     scaling;
    private double  skewFactor;
    private boolean minFlag;
    private double  min;
    private boolean maxFlag;
    private double  max;
    private String  variable;
}

