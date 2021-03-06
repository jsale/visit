// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

#include "QvisInverseGhostZoneWindow.h"

#include <InverseGhostZoneAttributes.h>

#include <QCheckBox>
#include <QLayout>


// ****************************************************************************
// Method: QvisInverseGhostZoneWindow::QvisInverseGhostZoneWindow
//
// Purpose: 
//   Constructor
//
// Note:       Autogenerated by xml2window.
//
// Programmer: xml2window
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

QvisInverseGhostZoneWindow::QvisInverseGhostZoneWindow(const int type,
                         InverseGhostZoneAttributes *subj,
                         const QString &caption,
                         const QString &shortName,
                         QvisNotepadArea *notepad)
    : QvisOperatorWindow(type,subj, caption, shortName, notepad)
{
    atts = subj;
}


// ****************************************************************************
// Method: QvisInverseGhostZoneWindow::~QvisInverseGhostZoneWindow
//
// Purpose: 
//   Destructor
//
// Note:       Autogenerated by xml2window.
//
// Programmer: xml2window
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

QvisInverseGhostZoneWindow::~QvisInverseGhostZoneWindow()
{
}


// ****************************************************************************
// Method: QvisInverseGhostZoneWindow::CreateWindowContents
//
// Purpose: 
//   Creates the widgets for the window.
//
// Note:       Autogenerated by xml2window.
//
// Programmer: xml2window
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

void
QvisInverseGhostZoneWindow::CreateWindowContents()
{
    QGridLayout *mainLayout = new QGridLayout(0);
    topLayout->addLayout(mainLayout);

    requestGhostZones = new QCheckBox(tr("Request Ghost Zones"), central);
    connect(requestGhostZones, SIGNAL(toggled(bool)),
            this, SLOT(requestGhostZonesChanged(bool)));
    mainLayout->addWidget(requestGhostZones, 0,0);

    showDuplicated = new QCheckBox(tr("Show Zones That Are Duplicated At Domain Boundaries"), central);
    connect(showDuplicated, SIGNAL(toggled(bool)),
            this, SLOT(showDuplicatedChanged(bool)));
    mainLayout->addWidget(showDuplicated, 1,0);

    showEnhancedConnectivity = new QCheckBox(tr("Show Enhanced Connectivity Zones"), central);
    connect(showEnhancedConnectivity, SIGNAL(toggled(bool)),
            this, SLOT(showEnhancedConnectivityChanged(bool)));
    mainLayout->addWidget(showEnhancedConnectivity, 2,0);

    showReducedConnectivity = new QCheckBox(tr("Show Reduced Connectivity Zones"), central);
    connect(showReducedConnectivity, SIGNAL(toggled(bool)),
            this, SLOT(showReducedConnectivityChanged(bool)));
    mainLayout->addWidget(showReducedConnectivity, 3,0);

    showAMRRefined = new QCheckBox(tr("Show zones refined out by finer patches (AMR)"), central);
    connect(showAMRRefined, SIGNAL(toggled(bool)),
            this, SLOT(showAMRRefinedChanged(bool)));
    mainLayout->addWidget(showAMRRefined, 4,0);

    showExterior = new QCheckBox(tr("Show cells on exterior of data set"), central);
    connect(showExterior, SIGNAL(toggled(bool)),
            this, SLOT(showExteriorChanged(bool)));
    mainLayout->addWidget(showExterior, 5,0);

    showNotApplicable = new QCheckBox(tr("Show zones deemed not applicable to problem"), central);
    connect(showNotApplicable, SIGNAL(toggled(bool)),
            this, SLOT(showNotApplicableChanged(bool)));
    mainLayout->addWidget(showNotApplicable, 6,0);

}


// ****************************************************************************
// Method: QvisInverseGhostZoneWindow::UpdateWindow
//
// Purpose: 
//   Updates the widgets in the window when the subject changes.
//
// Note:       Autogenerated by xml2window.
//
// Programmer: xml2window
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

void
QvisInverseGhostZoneWindow::UpdateWindow(bool doAll)
{

    for(int i = 0; i < atts->NumAttributes(); ++i)
    {
        if(!doAll)
        {
            if(!atts->IsSelected(i))
            {
                continue;
            }
        }

        switch(i)
        {
          case InverseGhostZoneAttributes::ID_requestGhostZones:
            requestGhostZones->blockSignals(true);
            requestGhostZones->setChecked(atts->GetRequestGhostZones());
            requestGhostZones->blockSignals(false);
            break;
          case InverseGhostZoneAttributes::ID_showDuplicated:
            showDuplicated->blockSignals(true);
            showDuplicated->setChecked(atts->GetShowDuplicated());
            showDuplicated->blockSignals(false);
            break;
          case InverseGhostZoneAttributes::ID_showEnhancedConnectivity:
            showEnhancedConnectivity->blockSignals(true);
            showEnhancedConnectivity->setChecked(atts->GetShowEnhancedConnectivity());
            showEnhancedConnectivity->blockSignals(false);
            break;
          case InverseGhostZoneAttributes::ID_showReducedConnectivity:
            showReducedConnectivity->blockSignals(true);
            showReducedConnectivity->setChecked(atts->GetShowReducedConnectivity());
            showReducedConnectivity->blockSignals(false);
            break;
          case InverseGhostZoneAttributes::ID_showAMRRefined:
            showAMRRefined->blockSignals(true);
            showAMRRefined->setChecked(atts->GetShowAMRRefined());
            showAMRRefined->blockSignals(false);
            break;
          case InverseGhostZoneAttributes::ID_showExterior:
            showExterior->blockSignals(true);
            showExterior->setChecked(atts->GetShowExterior());
            showExterior->blockSignals(false);
            break;
          case InverseGhostZoneAttributes::ID_showNotApplicable:
            showNotApplicable->blockSignals(true);
            showNotApplicable->setChecked(atts->GetShowNotApplicable());
            showNotApplicable->blockSignals(false);
            break;
        }
    }
}


// ****************************************************************************
// Method: QvisInverseGhostZoneWindow::GetCurrentValues
//
// Purpose: 
//   Gets values from certain widgets and stores them in the subject.
//
// Note:       Autogenerated by xml2window.
//
// Programmer: xml2window
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

void
QvisInverseGhostZoneWindow::GetCurrentValues(int which_widget)
{
}


//
// Qt Slot functions
//


void
QvisInverseGhostZoneWindow::requestGhostZonesChanged(bool val)
{
    atts->SetRequestGhostZones(val);
    SetUpdate(false);
    Apply();
}


void
QvisInverseGhostZoneWindow::showDuplicatedChanged(bool val)
{
    atts->SetShowDuplicated(val);
    SetUpdate(false);
    Apply();
}


void
QvisInverseGhostZoneWindow::showEnhancedConnectivityChanged(bool val)
{
    atts->SetShowEnhancedConnectivity(val);
    SetUpdate(false);
    Apply();
}


void
QvisInverseGhostZoneWindow::showReducedConnectivityChanged(bool val)
{
    atts->SetShowReducedConnectivity(val);
    SetUpdate(false);
    Apply();
}


void
QvisInverseGhostZoneWindow::showAMRRefinedChanged(bool val)
{
    atts->SetShowAMRRefined(val);
    SetUpdate(false);
    Apply();
}


void
QvisInverseGhostZoneWindow::showExteriorChanged(bool val)
{
    atts->SetShowExterior(val);
    SetUpdate(false);
    Apply();
}


void
QvisInverseGhostZoneWindow::showNotApplicableChanged(bool val)
{
    atts->SetShowNotApplicable(val);
    SetUpdate(false);
    Apply();
}


