// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

// ****************************************************************************
//  File: FiveFoldTetSubdivisionGUIPluginInfo.C
// ****************************************************************************

#include <FiveFoldTetSubdivisionPluginInfo.h>
#include <FiveFoldTetSubdivisionAttributes.h>
#include <QApplication>
#include <QvisFiveFoldTetSubdivisionWindow.h>

VISIT_OPERATOR_PLUGIN_ENTRY(FiveFoldTetSubdivision,GUI)

// ****************************************************************************
//  Method: FiveFoldTetSubdivisionGUIPluginInfo::GetMenuName
//
//  Purpose:
//    Return a pointer to the name to use in the GUI menu.
//
//  Returns:    A pointer to the name to use in the GUI menu.
//
//  Programmer: generated by xml2info
//  Creation:   omitted
//
// ****************************************************************************

QString *
FiveFoldTetSubdivisionGUIPluginInfo::GetMenuName() const
{
    return new QString(qApp->translate("OperatorNames", "Five Fold Tet Subdvision"));
}


// ****************************************************************************
//  Method: FiveFoldTetSubdivisionGUIPluginInfo::CreatePluginWindow
//
//  Purpose:
//    Return a pointer to an operator's attribute window.
//
//  Arguments:
//    type      The type of the operator.
//    attr      The attribute subject for the operator.
//    notepad   The notepad to use for posting the window.
//
//  Returns:    A pointer to the operator's attribute window.
//
//  Programmer: generated by xml2info
//  Creation:   omitted
//
// ****************************************************************************

QvisPostableWindowObserver *
FiveFoldTetSubdivisionGUIPluginInfo::CreatePluginWindow(int type, AttributeSubject *attr,
    const QString &caption, const QString &shortName, QvisNotepadArea *notepad)
{
    return new QvisFiveFoldTetSubdivisionWindow(type, (FiveFoldTetSubdivisionAttributes *)attr,
        caption, shortName, notepad);
}

