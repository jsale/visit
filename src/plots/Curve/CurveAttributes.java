// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

package llnl.visit.plots;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;
import llnl.visit.ColorAttribute;

// ****************************************************************************
// Class: CurveAttributes
//
// Purpose:
//    Attributes for the xy plot
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//
// ****************************************************************************

public class CurveAttributes extends AttributeSubject implements Plugin
{
    private static int CurveAttributes_numAdditionalAtts = 27;

    // Enum values
    public final static int CURVECOLOR_CYCLE = 0;
    public final static int CURVECOLOR_CUSTOM = 1;

    public final static int FILLMODE_STATIC = 0;
    public final static int FILLMODE_DYNAMIC = 1;

    public final static int SYMBOLTYPES_POINT = 0;
    public final static int SYMBOLTYPES_TRIANGLEUP = 1;
    public final static int SYMBOLTYPES_TRIANGLEDOWN = 2;
    public final static int SYMBOLTYPES_SQUARE = 3;
    public final static int SYMBOLTYPES_CIRCLE = 4;
    public final static int SYMBOLTYPES_PLUS = 5;
    public final static int SYMBOLTYPES_X = 6;

    public final static int CURVEFILLMODE_NOFILL = 0;
    public final static int CURVEFILLMODE_SOLID = 1;
    public final static int CURVEFILLMODE_HORIZONTALGRADIENT = 2;
    public final static int CURVEFILLMODE_VERTICALGRADIENT = 3;

    public final static int POLARCOORDINATEORDER_R_THETA = 0;
    public final static int POLARCOORDINATEORDER_THETA_R = 1;

    public final static int ANGLEUNITS_RADIANS = 0;
    public final static int ANGLEUNITS_DEGREES = 1;


    public CurveAttributes()
    {
        super(CurveAttributes_numAdditionalAtts);

        showLines = true;
        lineWidth = 0;
        showPoints = false;
        symbol = SYMBOLTYPES_POINT;
        pointSize = 5;
        pointFillMode = FILLMODE_STATIC;
        pointStride = 1;
        symbolDensity = 50;
        curveColorSource = CURVECOLOR_CYCLE;
        curveColor = new ColorAttribute(0, 0, 0);
        showLegend = true;
        showLabels = true;
        designator = new String("");
        doBallTimeCue = false;
        ballTimeCueColor = new ColorAttribute(0, 0, 0);
        timeCueBallSize = 0.01;
        doLineTimeCue = false;
        lineTimeCueColor = new ColorAttribute(0, 0, 0);
        lineTimeCueWidth = 0;
        doCropTimeCue = false;
        timeForTimeCue = 0;
        fillMode = CURVEFILLMODE_NOFILL;
        fillColor1 = new ColorAttribute(255, 0, 0);
        fillColor2 = new ColorAttribute(255, 100, 100);
        polarToCartesian = false;
        polarCoordinateOrder = POLARCOORDINATEORDER_R_THETA;
        angleUnits = ANGLEUNITS_RADIANS;
    }

    public CurveAttributes(int nMoreFields)
    {
        super(CurveAttributes_numAdditionalAtts + nMoreFields);

        showLines = true;
        lineWidth = 0;
        showPoints = false;
        symbol = SYMBOLTYPES_POINT;
        pointSize = 5;
        pointFillMode = FILLMODE_STATIC;
        pointStride = 1;
        symbolDensity = 50;
        curveColorSource = CURVECOLOR_CYCLE;
        curveColor = new ColorAttribute(0, 0, 0);
        showLegend = true;
        showLabels = true;
        designator = new String("");
        doBallTimeCue = false;
        ballTimeCueColor = new ColorAttribute(0, 0, 0);
        timeCueBallSize = 0.01;
        doLineTimeCue = false;
        lineTimeCueColor = new ColorAttribute(0, 0, 0);
        lineTimeCueWidth = 0;
        doCropTimeCue = false;
        timeForTimeCue = 0;
        fillMode = CURVEFILLMODE_NOFILL;
        fillColor1 = new ColorAttribute(255, 0, 0);
        fillColor2 = new ColorAttribute(255, 100, 100);
        polarToCartesian = false;
        polarCoordinateOrder = POLARCOORDINATEORDER_R_THETA;
        angleUnits = ANGLEUNITS_RADIANS;
    }

    public CurveAttributes(CurveAttributes obj)
    {
        super(obj);

        showLines = obj.showLines;
        lineWidth = obj.lineWidth;
        showPoints = obj.showPoints;
        symbol = obj.symbol;
        pointSize = obj.pointSize;
        pointFillMode = obj.pointFillMode;
        pointStride = obj.pointStride;
        symbolDensity = obj.symbolDensity;
        curveColorSource = obj.curveColorSource;
        curveColor = new ColorAttribute(obj.curveColor);
        showLegend = obj.showLegend;
        showLabels = obj.showLabels;
        designator = new String(obj.designator);
        doBallTimeCue = obj.doBallTimeCue;
        ballTimeCueColor = new ColorAttribute(obj.ballTimeCueColor);
        timeCueBallSize = obj.timeCueBallSize;
        doLineTimeCue = obj.doLineTimeCue;
        lineTimeCueColor = new ColorAttribute(obj.lineTimeCueColor);
        lineTimeCueWidth = obj.lineTimeCueWidth;
        doCropTimeCue = obj.doCropTimeCue;
        timeForTimeCue = obj.timeForTimeCue;
        fillMode = obj.fillMode;
        fillColor1 = new ColorAttribute(obj.fillColor1);
        fillColor2 = new ColorAttribute(obj.fillColor2);
        polarToCartesian = obj.polarToCartesian;
        polarCoordinateOrder = obj.polarCoordinateOrder;
        angleUnits = obj.angleUnits;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return CurveAttributes_numAdditionalAtts;
    }

    public boolean equals(CurveAttributes obj)
    {
        // Create the return value
        return ((showLines == obj.showLines) &&
                (lineWidth == obj.lineWidth) &&
                (showPoints == obj.showPoints) &&
                (symbol == obj.symbol) &&
                (pointSize == obj.pointSize) &&
                (pointFillMode == obj.pointFillMode) &&
                (pointStride == obj.pointStride) &&
                (symbolDensity == obj.symbolDensity) &&
                (curveColorSource == obj.curveColorSource) &&
                (curveColor == obj.curveColor) &&
                (showLegend == obj.showLegend) &&
                (showLabels == obj.showLabels) &&
                (designator.equals(obj.designator)) &&
                (doBallTimeCue == obj.doBallTimeCue) &&
                (ballTimeCueColor == obj.ballTimeCueColor) &&
                (timeCueBallSize == obj.timeCueBallSize) &&
                (doLineTimeCue == obj.doLineTimeCue) &&
                (lineTimeCueColor == obj.lineTimeCueColor) &&
                (lineTimeCueWidth == obj.lineTimeCueWidth) &&
                (doCropTimeCue == obj.doCropTimeCue) &&
                (timeForTimeCue == obj.timeForTimeCue) &&
                (fillMode == obj.fillMode) &&
                (fillColor1 == obj.fillColor1) &&
                (fillColor2 == obj.fillColor2) &&
                (polarToCartesian == obj.polarToCartesian) &&
                (polarCoordinateOrder == obj.polarCoordinateOrder) &&
                (angleUnits == obj.angleUnits));
    }

    public String GetName() { return "Curve"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetShowLines(boolean showLines_)
    {
        showLines = showLines_;
        Select(0);
    }

    public void SetLineWidth(int lineWidth_)
    {
        lineWidth = lineWidth_;
        Select(1);
    }

    public void SetShowPoints(boolean showPoints_)
    {
        showPoints = showPoints_;
        Select(2);
    }

    public void SetSymbol(int symbol_)
    {
        symbol = symbol_;
        Select(3);
    }

    public void SetPointSize(double pointSize_)
    {
        pointSize = pointSize_;
        Select(4);
    }

    public void SetPointFillMode(int pointFillMode_)
    {
        pointFillMode = pointFillMode_;
        Select(5);
    }

    public void SetPointStride(int pointStride_)
    {
        pointStride = pointStride_;
        Select(6);
    }

    public void SetSymbolDensity(int symbolDensity_)
    {
        symbolDensity = symbolDensity_;
        Select(7);
    }

    public void SetCurveColorSource(int curveColorSource_)
    {
        curveColorSource = curveColorSource_;
        Select(8);
    }

    public void SetCurveColor(ColorAttribute curveColor_)
    {
        curveColor = curveColor_;
        Select(9);
    }

    public void SetShowLegend(boolean showLegend_)
    {
        showLegend = showLegend_;
        Select(10);
    }

    public void SetShowLabels(boolean showLabels_)
    {
        showLabels = showLabels_;
        Select(11);
    }

    public void SetDesignator(String designator_)
    {
        designator = designator_;
        Select(12);
    }

    public void SetDoBallTimeCue(boolean doBallTimeCue_)
    {
        doBallTimeCue = doBallTimeCue_;
        Select(13);
    }

    public void SetBallTimeCueColor(ColorAttribute ballTimeCueColor_)
    {
        ballTimeCueColor = ballTimeCueColor_;
        Select(14);
    }

    public void SetTimeCueBallSize(double timeCueBallSize_)
    {
        timeCueBallSize = timeCueBallSize_;
        Select(15);
    }

    public void SetDoLineTimeCue(boolean doLineTimeCue_)
    {
        doLineTimeCue = doLineTimeCue_;
        Select(16);
    }

    public void SetLineTimeCueColor(ColorAttribute lineTimeCueColor_)
    {
        lineTimeCueColor = lineTimeCueColor_;
        Select(17);
    }

    public void SetLineTimeCueWidth(int lineTimeCueWidth_)
    {
        lineTimeCueWidth = lineTimeCueWidth_;
        Select(18);
    }

    public void SetDoCropTimeCue(boolean doCropTimeCue_)
    {
        doCropTimeCue = doCropTimeCue_;
        Select(19);
    }

    public void SetTimeForTimeCue(double timeForTimeCue_)
    {
        timeForTimeCue = timeForTimeCue_;
        Select(20);
    }

    public void SetFillMode(int fillMode_)
    {
        fillMode = fillMode_;
        Select(21);
    }

    public void SetFillColor1(ColorAttribute fillColor1_)
    {
        fillColor1 = fillColor1_;
        Select(22);
    }

    public void SetFillColor2(ColorAttribute fillColor2_)
    {
        fillColor2 = fillColor2_;
        Select(23);
    }

    public void SetPolarToCartesian(boolean polarToCartesian_)
    {
        polarToCartesian = polarToCartesian_;
        Select(24);
    }

    public void SetPolarCoordinateOrder(int polarCoordinateOrder_)
    {
        polarCoordinateOrder = polarCoordinateOrder_;
        Select(25);
    }

    public void SetAngleUnits(int angleUnits_)
    {
        angleUnits = angleUnits_;
        Select(26);
    }

    // Property getting methods
    public boolean        GetShowLines() { return showLines; }
    public int            GetLineWidth() { return lineWidth; }
    public boolean        GetShowPoints() { return showPoints; }
    public int            GetSymbol() { return symbol; }
    public double         GetPointSize() { return pointSize; }
    public int            GetPointFillMode() { return pointFillMode; }
    public int            GetPointStride() { return pointStride; }
    public int            GetSymbolDensity() { return symbolDensity; }
    public int            GetCurveColorSource() { return curveColorSource; }
    public ColorAttribute GetCurveColor() { return curveColor; }
    public boolean        GetShowLegend() { return showLegend; }
    public boolean        GetShowLabels() { return showLabels; }
    public String         GetDesignator() { return designator; }
    public boolean        GetDoBallTimeCue() { return doBallTimeCue; }
    public ColorAttribute GetBallTimeCueColor() { return ballTimeCueColor; }
    public double         GetTimeCueBallSize() { return timeCueBallSize; }
    public boolean        GetDoLineTimeCue() { return doLineTimeCue; }
    public ColorAttribute GetLineTimeCueColor() { return lineTimeCueColor; }
    public int            GetLineTimeCueWidth() { return lineTimeCueWidth; }
    public boolean        GetDoCropTimeCue() { return doCropTimeCue; }
    public double         GetTimeForTimeCue() { return timeForTimeCue; }
    public int            GetFillMode() { return fillMode; }
    public ColorAttribute GetFillColor1() { return fillColor1; }
    public ColorAttribute GetFillColor2() { return fillColor2; }
    public boolean        GetPolarToCartesian() { return polarToCartesian; }
    public int            GetPolarCoordinateOrder() { return polarCoordinateOrder; }
    public int            GetAngleUnits() { return angleUnits; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(showLines);
        if(WriteSelect(1, buf))
            buf.WriteInt(lineWidth);
        if(WriteSelect(2, buf))
            buf.WriteBool(showPoints);
        if(WriteSelect(3, buf))
            buf.WriteInt(symbol);
        if(WriteSelect(4, buf))
            buf.WriteDouble(pointSize);
        if(WriteSelect(5, buf))
            buf.WriteInt(pointFillMode);
        if(WriteSelect(6, buf))
            buf.WriteInt(pointStride);
        if(WriteSelect(7, buf))
            buf.WriteInt(symbolDensity);
        if(WriteSelect(8, buf))
            buf.WriteInt(curveColorSource);
        if(WriteSelect(9, buf))
            curveColor.Write(buf);
        if(WriteSelect(10, buf))
            buf.WriteBool(showLegend);
        if(WriteSelect(11, buf))
            buf.WriteBool(showLabels);
        if(WriteSelect(12, buf))
            buf.WriteString(designator);
        if(WriteSelect(13, buf))
            buf.WriteBool(doBallTimeCue);
        if(WriteSelect(14, buf))
            ballTimeCueColor.Write(buf);
        if(WriteSelect(15, buf))
            buf.WriteDouble(timeCueBallSize);
        if(WriteSelect(16, buf))
            buf.WriteBool(doLineTimeCue);
        if(WriteSelect(17, buf))
            lineTimeCueColor.Write(buf);
        if(WriteSelect(18, buf))
            buf.WriteInt(lineTimeCueWidth);
        if(WriteSelect(19, buf))
            buf.WriteBool(doCropTimeCue);
        if(WriteSelect(20, buf))
            buf.WriteDouble(timeForTimeCue);
        if(WriteSelect(21, buf))
            buf.WriteInt(fillMode);
        if(WriteSelect(22, buf))
            fillColor1.Write(buf);
        if(WriteSelect(23, buf))
            fillColor2.Write(buf);
        if(WriteSelect(24, buf))
            buf.WriteBool(polarToCartesian);
        if(WriteSelect(25, buf))
            buf.WriteInt(polarCoordinateOrder);
        if(WriteSelect(26, buf))
            buf.WriteInt(angleUnits);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetShowLines(buf.ReadBool());
            break;
        case 1:
            SetLineWidth(buf.ReadInt());
            break;
        case 2:
            SetShowPoints(buf.ReadBool());
            break;
        case 3:
            SetSymbol(buf.ReadInt());
            break;
        case 4:
            SetPointSize(buf.ReadDouble());
            break;
        case 5:
            SetPointFillMode(buf.ReadInt());
            break;
        case 6:
            SetPointStride(buf.ReadInt());
            break;
        case 7:
            SetSymbolDensity(buf.ReadInt());
            break;
        case 8:
            SetCurveColorSource(buf.ReadInt());
            break;
        case 9:
            curveColor.Read(buf);
            Select(9);
            break;
        case 10:
            SetShowLegend(buf.ReadBool());
            break;
        case 11:
            SetShowLabels(buf.ReadBool());
            break;
        case 12:
            SetDesignator(buf.ReadString());
            break;
        case 13:
            SetDoBallTimeCue(buf.ReadBool());
            break;
        case 14:
            ballTimeCueColor.Read(buf);
            Select(14);
            break;
        case 15:
            SetTimeCueBallSize(buf.ReadDouble());
            break;
        case 16:
            SetDoLineTimeCue(buf.ReadBool());
            break;
        case 17:
            lineTimeCueColor.Read(buf);
            Select(17);
            break;
        case 18:
            SetLineTimeCueWidth(buf.ReadInt());
            break;
        case 19:
            SetDoCropTimeCue(buf.ReadBool());
            break;
        case 20:
            SetTimeForTimeCue(buf.ReadDouble());
            break;
        case 21:
            SetFillMode(buf.ReadInt());
            break;
        case 22:
            fillColor1.Read(buf);
            Select(22);
            break;
        case 23:
            fillColor2.Read(buf);
            Select(23);
            break;
        case 24:
            SetPolarToCartesian(buf.ReadBool());
            break;
        case 25:
            SetPolarCoordinateOrder(buf.ReadInt());
            break;
        case 26:
            SetAngleUnits(buf.ReadInt());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + boolToString("showLines", showLines, indent) + "\n";
        str = str + intToString("lineWidth", lineWidth, indent) + "\n";
        str = str + boolToString("showPoints", showPoints, indent) + "\n";
        str = str + indent + "symbol = ";
        if(symbol == SYMBOLTYPES_POINT)
            str = str + "SYMBOLTYPES_POINT";
        if(symbol == SYMBOLTYPES_TRIANGLEUP)
            str = str + "SYMBOLTYPES_TRIANGLEUP";
        if(symbol == SYMBOLTYPES_TRIANGLEDOWN)
            str = str + "SYMBOLTYPES_TRIANGLEDOWN";
        if(symbol == SYMBOLTYPES_SQUARE)
            str = str + "SYMBOLTYPES_SQUARE";
        if(symbol == SYMBOLTYPES_CIRCLE)
            str = str + "SYMBOLTYPES_CIRCLE";
        if(symbol == SYMBOLTYPES_PLUS)
            str = str + "SYMBOLTYPES_PLUS";
        if(symbol == SYMBOLTYPES_X)
            str = str + "SYMBOLTYPES_X";
        str = str + "\n";
        str = str + doubleToString("pointSize", pointSize, indent) + "\n";
        str = str + indent + "pointFillMode = ";
        if(pointFillMode == FILLMODE_STATIC)
            str = str + "FILLMODE_STATIC";
        if(pointFillMode == FILLMODE_DYNAMIC)
            str = str + "FILLMODE_DYNAMIC";
        str = str + "\n";
        str = str + intToString("pointStride", pointStride, indent) + "\n";
        str = str + intToString("symbolDensity", symbolDensity, indent) + "\n";
        str = str + indent + "curveColorSource = ";
        if(curveColorSource == CURVECOLOR_CYCLE)
            str = str + "CURVECOLOR_CYCLE";
        if(curveColorSource == CURVECOLOR_CUSTOM)
            str = str + "CURVECOLOR_CUSTOM";
        str = str + "\n";
        str = str + indent + "curveColor = {" + curveColor.Red() + ", " + curveColor.Green() + ", " + curveColor.Blue() + ", " + curveColor.Alpha() + "}\n";
        str = str + boolToString("showLegend", showLegend, indent) + "\n";
        str = str + boolToString("showLabels", showLabels, indent) + "\n";
        str = str + stringToString("designator", designator, indent) + "\n";
        str = str + boolToString("doBallTimeCue", doBallTimeCue, indent) + "\n";
        str = str + indent + "ballTimeCueColor = {" + ballTimeCueColor.Red() + ", " + ballTimeCueColor.Green() + ", " + ballTimeCueColor.Blue() + ", " + ballTimeCueColor.Alpha() + "}\n";
        str = str + doubleToString("timeCueBallSize", timeCueBallSize, indent) + "\n";
        str = str + boolToString("doLineTimeCue", doLineTimeCue, indent) + "\n";
        str = str + indent + "lineTimeCueColor = {" + lineTimeCueColor.Red() + ", " + lineTimeCueColor.Green() + ", " + lineTimeCueColor.Blue() + ", " + lineTimeCueColor.Alpha() + "}\n";
        str = str + intToString("lineTimeCueWidth", lineTimeCueWidth, indent) + "\n";
        str = str + boolToString("doCropTimeCue", doCropTimeCue, indent) + "\n";
        str = str + doubleToString("timeForTimeCue", timeForTimeCue, indent) + "\n";
        str = str + indent + "fillMode = ";
        if(fillMode == CURVEFILLMODE_NOFILL)
            str = str + "CURVEFILLMODE_NOFILL";
        if(fillMode == CURVEFILLMODE_SOLID)
            str = str + "CURVEFILLMODE_SOLID";
        if(fillMode == CURVEFILLMODE_HORIZONTALGRADIENT)
            str = str + "CURVEFILLMODE_HORIZONTALGRADIENT";
        if(fillMode == CURVEFILLMODE_VERTICALGRADIENT)
            str = str + "CURVEFILLMODE_VERTICALGRADIENT";
        str = str + "\n";
        str = str + indent + "fillColor1 = {" + fillColor1.Red() + ", " + fillColor1.Green() + ", " + fillColor1.Blue() + ", " + fillColor1.Alpha() + "}\n";
        str = str + indent + "fillColor2 = {" + fillColor2.Red() + ", " + fillColor2.Green() + ", " + fillColor2.Blue() + ", " + fillColor2.Alpha() + "}\n";
        str = str + boolToString("polarToCartesian", polarToCartesian, indent) + "\n";
        str = str + indent + "polarCoordinateOrder = ";
        if(polarCoordinateOrder == POLARCOORDINATEORDER_R_THETA)
            str = str + "POLARCOORDINATEORDER_R_THETA";
        if(polarCoordinateOrder == POLARCOORDINATEORDER_THETA_R)
            str = str + "POLARCOORDINATEORDER_THETA_R";
        str = str + "\n";
        str = str + indent + "angleUnits = ";
        if(angleUnits == ANGLEUNITS_RADIANS)
            str = str + "ANGLEUNITS_RADIANS";
        if(angleUnits == ANGLEUNITS_DEGREES)
            str = str + "ANGLEUNITS_DEGREES";
        str = str + "\n";
        return str;
    }


    // Attributes
    private boolean        showLines;
    private int            lineWidth;
    private boolean        showPoints;
    private int            symbol;
    private double         pointSize;
    private int            pointFillMode;
    private int            pointStride;
    private int            symbolDensity;
    private int            curveColorSource;
    private ColorAttribute curveColor;
    private boolean        showLegend;
    private boolean        showLabels;
    private String         designator;
    private boolean        doBallTimeCue;
    private ColorAttribute ballTimeCueColor;
    private double         timeCueBallSize;
    private boolean        doLineTimeCue;
    private ColorAttribute lineTimeCueColor;
    private int            lineTimeCueWidth;
    private boolean        doCropTimeCue;
    private double         timeForTimeCue;
    private int            fillMode;
    private ColorAttribute fillColor1;
    private ColorAttribute fillColor2;
    private boolean        polarToCartesian;
    private int            polarCoordinateOrder;
    private int            angleUnits;
}

