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

package llnl.visit.plots;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;
import llnl.visit.ColorAttributeList;

// ****************************************************************************
// Class: TopologyAttributes
//
// Purpose:
//    This class contains the plot attributes for the topology plot
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Thu Jul 31 16:08:05 PST 2003
//
// Modifications:
//   
// ****************************************************************************

public class TopologyAttributes extends AttributeSubject implements Plugin
{
    public TopologyAttributes()
    {
        super(9);

        lineWidth = 2;
        lineStyle = 0;
        multiColor = new ColorAttributeList();
        minOpacity = 1;
        minPlateauOpacity = 1;
        maxPlateauOpacity = 1;
        maxOpacity = 1;
        tolerance = 1e-06;
        hitpercent = 0;
    }

    public TopologyAttributes(TopologyAttributes obj)
    {
        super(9);

        lineWidth = obj.lineWidth;
        lineStyle = obj.lineStyle;
        multiColor = new ColorAttributeList(obj.multiColor);
        minOpacity = obj.minOpacity;
        minPlateauOpacity = obj.minPlateauOpacity;
        maxPlateauOpacity = obj.maxPlateauOpacity;
        maxOpacity = obj.maxOpacity;
        tolerance = obj.tolerance;
        hitpercent = obj.hitpercent;

        SelectAll();
    }

    public boolean equals(TopologyAttributes obj)
    {
        // Create the return value
        return ((lineWidth == obj.lineWidth) &&
                (lineStyle == obj.lineStyle) &&
                (multiColor == obj.multiColor) &&
                (minOpacity == obj.minOpacity) &&
                (minPlateauOpacity == obj.minPlateauOpacity) &&
                (maxPlateauOpacity == obj.maxPlateauOpacity) &&
                (maxOpacity == obj.maxOpacity) &&
                (tolerance == obj.tolerance) &&
                (hitpercent == obj.hitpercent));
    }

    public String GetName() { return "Topology"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetLineWidth(int lineWidth_)
    {
        lineWidth = lineWidth_;
        Select(0);
    }

    public void SetLineStyle(int lineStyle_)
    {
        lineStyle = lineStyle_;
        Select(1);
    }

    public void SetMultiColor(ColorAttributeList multiColor_)
    {
        multiColor = multiColor_;
        Select(2);
    }

    public void SetMinOpacity(double minOpacity_)
    {
        minOpacity = minOpacity_;
        Select(3);
    }

    public void SetMinPlateauOpacity(double minPlateauOpacity_)
    {
        minPlateauOpacity = minPlateauOpacity_;
        Select(4);
    }

    public void SetMaxPlateauOpacity(double maxPlateauOpacity_)
    {
        maxPlateauOpacity = maxPlateauOpacity_;
        Select(5);
    }

    public void SetMaxOpacity(double maxOpacity_)
    {
        maxOpacity = maxOpacity_;
        Select(6);
    }

    public void SetTolerance(double tolerance_)
    {
        tolerance = tolerance_;
        Select(7);
    }

    public void SetHitpercent(double hitpercent_)
    {
        hitpercent = hitpercent_;
        Select(8);
    }

    // Property getting methods
    public int                GetLineWidth() { return lineWidth; }
    public int                GetLineStyle() { return lineStyle; }
    public ColorAttributeList GetMultiColor() { return multiColor; }
    public double             GetMinOpacity() { return minOpacity; }
    public double             GetMinPlateauOpacity() { return minPlateauOpacity; }
    public double             GetMaxPlateauOpacity() { return maxPlateauOpacity; }
    public double             GetMaxOpacity() { return maxOpacity; }
    public double             GetTolerance() { return tolerance; }
    public double             GetHitpercent() { return hitpercent; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(lineWidth);
        if(WriteSelect(1, buf))
            buf.WriteInt(lineStyle);
        if(WriteSelect(2, buf))
            multiColor.Write(buf);
        if(WriteSelect(3, buf))
            buf.WriteDouble(minOpacity);
        if(WriteSelect(4, buf))
            buf.WriteDouble(minPlateauOpacity);
        if(WriteSelect(5, buf))
            buf.WriteDouble(maxPlateauOpacity);
        if(WriteSelect(6, buf))
            buf.WriteDouble(maxOpacity);
        if(WriteSelect(7, buf))
            buf.WriteDouble(tolerance);
        if(WriteSelect(8, buf))
            buf.WriteDouble(hitpercent);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetLineWidth(buf.ReadInt());
                break;
            case 1:
                SetLineStyle(buf.ReadInt());
                break;
            case 2:
                multiColor.Read(buf);
                Select(2);
                break;
            case 3:
                SetMinOpacity(buf.ReadDouble());
                break;
            case 4:
                SetMinPlateauOpacity(buf.ReadDouble());
                break;
            case 5:
                SetMaxPlateauOpacity(buf.ReadDouble());
                break;
            case 6:
                SetMaxOpacity(buf.ReadDouble());
                break;
            case 7:
                SetTolerance(buf.ReadDouble());
                break;
            case 8:
                SetHitpercent(buf.ReadDouble());
                break;
            }
        }
    }


    // Attributes
    private int                lineWidth;
    private int                lineStyle;
    private ColorAttributeList multiColor;
    private double             minOpacity;
    private double             minPlateauOpacity;
    private double             maxPlateauOpacity;
    private double             maxOpacity;
    private double             tolerance;
    private double             hitpercent;
}

