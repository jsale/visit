/*****************************************************************************
*
* Copyright (c) 2000 - 2007, The Regents of the University of California
* Produced at the Lawrence Livermore National Laboratory
* All rights reserved.
*
* This file is part of VisIt. For details, see http://www.llnl.gov/visit/. The
* full copyright notice is contained in the file COPYRIGHT located at the root
* of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
*
* Redistribution  and  use  in  source  and  binary  forms,  with  or  without
* modification, are permitted provided that the following conditions are met:
*
*  - Redistributions of  source code must  retain the above  copyright notice,
*    this list of conditions and the disclaimer below.
*  - Redistributions in binary form must reproduce the above copyright notice,
*    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
*    documentation and/or materials provided with the distribution.
*  - Neither the name of the UC/LLNL nor  the names of its contributors may be
*    used to  endorse or  promote products derived from  this software without
*    specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
* AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
* IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
* ARE  DISCLAIMED.  IN  NO  EVENT  SHALL  THE  REGENTS  OF  THE  UNIVERSITY OF
* CALIFORNIA, THE U.S.  DEPARTMENT  OF  ENERGY OR CONTRIBUTORS BE  LIABLE  FOR
* ANY  DIRECT,  INDIRECT,  INCIDENTAL,  SPECIAL,  EXEMPLARY,  OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
* SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
* CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
* LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
* OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
* DAMAGE.
*
*****************************************************************************/

#ifndef SMOOTHOPERATORATTRIBUTES_H
#define SMOOTHOPERATORATTRIBUTES_H
#include <AttributeSubject.h>

// ****************************************************************************
// Class: SmoothOperatorAttributes
//
// Purpose:
//    Attributes for the Smooth Operator
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   Sun Aug 14 11:59:57 PDT 2005
//
// Modifications:
//   
// ****************************************************************************

class SmoothOperatorAttributes : public AttributeSubject
{
public:
    SmoothOperatorAttributes();
    SmoothOperatorAttributes(const SmoothOperatorAttributes &obj);
    virtual ~SmoothOperatorAttributes();

    virtual SmoothOperatorAttributes& operator = (const SmoothOperatorAttributes &obj);
    virtual bool operator == (const SmoothOperatorAttributes &obj) const;
    virtual bool operator != (const SmoothOperatorAttributes &obj) const;

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();

    // Property setting methods
    void SetNumIterations(int numIterations_);
    void SetRelaxationFactor(double relaxationFactor_);
    void SetConvergence(double convergence_);
    void SetMaintainFeatures(bool maintainFeatures_);
    void SetFeatureAngle(double featureAngle_);
    void SetEdgeAngle(double edgeAngle_);
    void SetSmoothBoundaries(bool smoothBoundaries_);

    // Property getting methods
    int    GetNumIterations() const;
    double GetRelaxationFactor() const;
    double GetConvergence() const;
    bool   GetMaintainFeatures() const;
    double GetFeatureAngle() const;
    double GetEdgeAngle() const;
    bool   GetSmoothBoundaries() const;

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);


    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

private:
    int    numIterations;
    double relaxationFactor;
    double convergence;
    bool   maintainFeatures;
    double featureAngle;
    double edgeAngle;
    bool   smoothBoundaries;
};

#endif
