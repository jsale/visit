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

package llnl.visit;


// ****************************************************************************
// Class: InteractorAttributes
//
// Purpose:
//    This class contains attributes associated with the main window.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Mon Dec 27 11:27:58 PDT 2004
//
// Modifications:
//   
// ****************************************************************************

public class InteractorAttributes extends AttributeSubject
{
    // Enum values
    public final static int NAVIGATIONMODE_TRACKBALL = 0;
    public final static int NAVIGATIONMODE_DOLLY = 1;
    public final static int NAVIGATIONMODE_FLYTHROUGH = 2;


    public InteractorAttributes()
    {
        super(4);

        showGuidelines = true;
        clampSquare = false;
        fillViewportOnZoom = true;
        navigationMode = NAVIGATIONMODE_TRACKBALL;
    }

    public InteractorAttributes(InteractorAttributes obj)
    {
        super(4);

        showGuidelines = obj.showGuidelines;
        clampSquare = obj.clampSquare;
        fillViewportOnZoom = obj.fillViewportOnZoom;
        navigationMode = obj.navigationMode;

        SelectAll();
    }

    public boolean equals(InteractorAttributes obj)
    {
        // Create the return value
        return ((showGuidelines == obj.showGuidelines) &&
                (clampSquare == obj.clampSquare) &&
                (fillViewportOnZoom == obj.fillViewportOnZoom) &&
                (navigationMode == obj.navigationMode));
    }

    // Property setting methods
    public void SetShowGuidelines(boolean showGuidelines_)
    {
        showGuidelines = showGuidelines_;
        Select(0);
    }

    public void SetClampSquare(boolean clampSquare_)
    {
        clampSquare = clampSquare_;
        Select(1);
    }

    public void SetFillViewportOnZoom(boolean fillViewportOnZoom_)
    {
        fillViewportOnZoom = fillViewportOnZoom_;
        Select(2);
    }

    public void SetNavigationMode(int navigationMode_)
    {
        navigationMode = navigationMode_;
        Select(3);
    }

    // Property getting methods
    public boolean GetShowGuidelines() { return showGuidelines; }
    public boolean GetClampSquare() { return clampSquare; }
    public boolean GetFillViewportOnZoom() { return fillViewportOnZoom; }
    public int     GetNavigationMode() { return navigationMode; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(showGuidelines);
        if(WriteSelect(1, buf))
            buf.WriteBool(clampSquare);
        if(WriteSelect(2, buf))
            buf.WriteBool(fillViewportOnZoom);
        if(WriteSelect(3, buf))
            buf.WriteInt(navigationMode);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetShowGuidelines(buf.ReadBool());
                break;
            case 1:
                SetClampSquare(buf.ReadBool());
                break;
            case 2:
                SetFillViewportOnZoom(buf.ReadBool());
                break;
            case 3:
                SetNavigationMode(buf.ReadInt());
                break;
            }
        }
    }


    // Attributes
    private boolean showGuidelines;
    private boolean clampSquare;
    private boolean fillViewportOnZoom;
    private int     navigationMode;
}

