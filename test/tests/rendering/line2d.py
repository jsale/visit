# ----------------------------------------------------------------------------
#  CLASSES: nightly
#
#  Test Case:  line2d.py
#
#  Tests:      mesh        - 2D curvilinear, single domain
#              plots       - Pseudocolor
#              annotations - Line2D
#
#  Defect ID:  #1724 (arrowheads for 2D Line annotations broke in 2.7) 
#
#  Programmer: Kathleen Biagas 
#  Date:       July 1, 2015
#
#  Modifications:
#
# ----------------------------------------------------------------------------

# Set up the annotation colors, etc.
a = GetAnnotationAttributes()
a.backgroundColor = (255, 255, 255, 255)
a.foregroundColor = (0, 0, 0, 255)
a.backgroundMode = a.Solid
SetAnnotationAttributes(a)

# Open up the database and do a plot.
OpenDatabase(silo_data_path("curv2d.silo"))

AddPlot("Pseudocolor", "u")
DrawPlots()

# Create a Line2D object
line = CreateAnnotationObject("Line2D")
line.position = (0.62, 0.83)
line.position2 = (0.43, 0.7)
Test("line2d00")

# uncomment when line2D has 'use foreground color' option. #2327
# Set the foreground color to see if it changes
#a.foregroundColor = (255, 255, 0, 255)
#SetAnnotationAttributes(a)1Gjk
#Test("line2d01")

# Test solid text color
#a.foregroundColor = (255, 255, 255, 255)
#SetAnnotationAttributes(a)
#line.useForegroundForTextColor = 0
line.color = (0, 255, 255, 255)
Test("line2d02")

# Test line width
line.width = 4
Test("line2d03")


# Test line arrow at start
line.color = (0,0,0,255)
line.width = 1
line.beginArrow = 1
Test("line2d04")

# Test solid arrow at end
line.endArrow = 2
Test("line2d05")

# Switch arrows
line.beginArrow = 2
line.endArrow = 1
Test("line2d06")

# Test line opacity
line.position = (0.25, 0.32)
line.position2 = (0.85, 0.71)
line.width = 5
line.beginArrow = 0
line.endArrow = 0
line.color = (0,0,0,150)
Test("line2d07")

# Create more line objects
nextLine = CreateAnnotationObject("Line2D")
nextLine.color=(255, 0, 0, 255)
nextLine.position=(0.41, 0.86)
nextLine.position2=(0.75, 0.6)
nextLine.width=2
nextLine.endArrow=2
Test("line2d08")

# Start Removing text
line.Delete()
Test("line2d09")
nextLine.Delete()
Test("line2d10")


Exit()
