# Microsoft Developer Studio Project File - Name="jbioapi" - Package Owner=<4>
# Microsoft Developer Studio Generated Build File, Format Version 6.00
# ** DO NOT EDIT **

# TARGTYPE "Win32 (x86) Dynamic-Link Library" 0x0102

CFG=jbioapi - Win32 MemDebug
!MESSAGE This is not a valid makefile. To build this project using NMAKE,
!MESSAGE use the Export Makefile command and run
!MESSAGE 
!MESSAGE NMAKE /f "jbioapi.mak".
!MESSAGE 
!MESSAGE You can specify a configuration when running NMAKE
!MESSAGE by defining the macro CFG on the command line. For example:
!MESSAGE 
!MESSAGE NMAKE /f "jbioapi.mak" CFG="jbioapi - Win32 MemDebug"
!MESSAGE 
!MESSAGE Possible choices for configuration are:
!MESSAGE 
!MESSAGE "jbioapi - Win32 Release" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE "jbioapi - Win32 Debug" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE "jbioapi - Win32 MemDebug" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE 

# Begin Project
# PROP AllowPerConfigDependencies 0
# PROP Scc_ProjName ""
# PROP Scc_LocalPath ""
CPP=cl.exe
MTL=midl.exe
RSC=rc.exe

!IF  "$(CFG)" == "jbioapi - Win32 Release"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 0
# PROP BASE Output_Dir "Release"
# PROP BASE Intermediate_Dir "Release"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 0
# PROP Output_Dir "Release"
# PROP Intermediate_Dir "Release"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MT /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "jbioapi_EXPORTS" /YX /FD /c
# ADD CPP /nologo /MT /W4 /GX /O2 /I "." /I "..\..\include" /I "..\mds_util" /I "..\..\imports\cdsa\v2_0\inc" /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "jbioapi_EXPORTS" /FD /c
# ADD BASE MTL /nologo /D "NDEBUG" /mktyplib203 /win32
# ADD MTL /nologo /D "NDEBUG" /mktyplib203 /win32
# ADD BASE RSC /l 0x409 /d "NDEBUG"
# ADD RSC /l 0x409 /d "NDEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /machine:I386
# ADD LINK32 bioapi100.lib mds_util.lib mds_util_api.lib install.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib bioapi_mds300.lib port.lib bioapi_util.lib /nologo /dll /machine:I386 /out:"Release/jbioapi.dll" /libpath:"..\..\build\release\lib" /libpath:"..\..\imports\cdsa\v2_0\release\lib"
# Begin Custom Build
TargetDir=.\Release
TargetPath=.\Release\jbioapi.dll
TargetName=jbioapi
InputPath=.\Release\jbioapi.dll
SOURCE="$(InputPath)"

BuildCmds= \
	echo on \
	copy $(TargetPath) ..\..\build\release\dll \
	copy $(TargetDir)\$(TargetName).lib ..\..\build\release\lib \
	echo off \
	

"..\..\build\release\dll\$(TargetName).dll" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
   $(BuildCmds)

"..\..\build\release\lib\$(TargetName).lib" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
   $(BuildCmds)
# End Custom Build

!ELSEIF  "$(CFG)" == "jbioapi - Win32 Debug"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "Debug"
# PROP BASE Intermediate_Dir "Debug"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "Debug"
# PROP Intermediate_Dir "Debug"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MTd /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "jbioapi_EXPORTS" /YX /FD /GZ /c
# ADD CPP /nologo /MTd /W4 /Gm /GX /ZI /Od /I "." /I "..\..\include" /I "..\mds_util" /I "..\..\imports\cdsa\v2_0\inc" /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "jbioapi_EXPORTS" /FR /FD /GZ /c
# ADD BASE MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD BASE RSC /l 0x409 /d "_DEBUG"
# ADD RSC /l 0x409 /d "_DEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /debug /machine:I386 /pdbtype:sept
# ADD LINK32 install.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib bioapi_mds300.lib port.lib bioapi_util.lib /nologo /dll /debug /machine:I386 /out:"Debug/bioapi100.dll" /pdbtype:sept /libpath:"..\..\build\debug\lib" /libpath:"..\..\imports\cdsa\v2_0\debug\lib"
# Begin Custom Build
TargetDir=.\Debug
TargetPath=.\Debug\bioapi100.dll
TargetName=bioapi100
InputPath=.\Debug\bioapi100.dll
SOURCE="$(InputPath)"

BuildCmds= \
	echo on \
	copy $(TargetPath) ..\..\build\debug\dll \
	copy $(TargetDir)\$(TargetName).lib ..\..\build\debug\lib \
	echo off \
	

"..\..\build\debug\dll\$(TargetName).dll" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
   $(BuildCmds)

"..\..\build\debug\lib\$(TargetName).lib" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
   $(BuildCmds)
# End Custom Build

!ELSEIF  "$(CFG)" == "jbioapi - Win32 MemDebug"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "MemDebug"
# PROP BASE Intermediate_Dir "MemDebug"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "MemDebug"
# PROP Intermediate_Dir "MemDebug"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MTd /W4 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "jbioapi_EXPORTS" /YX /FD /GZ /c
# ADD CPP /nologo /MTd /W4 /Gm /GX /ZI /Od /I "." /I "..\..\include" /I "..\mds_util" /I "..\..\imports\cdsa\v2_0\inc" /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "jbioapi_EXPORTS" /D "BioAPI_MEMTRACK_ON" /FR /FD /GZ /c
# ADD BASE MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD BASE RSC /l 0x409 /d "_DEBUG"
# ADD RSC /l 0x409 /d "_DEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /debug /machine:I386 /pdbtype:sept
# ADD LINK32 bioapi100.lib msjava.lib mds_util.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib bioapi_mds300.lib port.lib bioapi_util.lib /nologo /dll /debug /machine:I386 /out:"MemDebug/jbioapi.dll" /pdbtype:sept /libpath:"..\..\build\memdebug\lib" /libpath:"..\..\imports\cdsa\v2_0\memdebug\lib"
# SUBTRACT LINK32 /incremental:no /nodefaultlib
# Begin Custom Build
TargetDir=.\MemDebug
TargetPath=.\MemDebug\jbioapi.dll
TargetName=jbioapi
InputPath=.\MemDebug\jbioapi.dll
SOURCE="$(InputPath)"

BuildCmds= \
	echo on \
	copy $(TargetPath) ..\..\build\memdebug\dll \
	copy $(TargetDir)\$(TargetName).lib ..\..\build\memdebug\lib \
	echo off \
	

"..\..\build\memdebug\dll\$(TargetName).dll" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
   $(BuildCmds)

"..\..\build\memdebug\lib\$(TargetName).lib" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
   $(BuildCmds)
# End Custom Build

!ENDIF 

# Begin Target

# Name "jbioapi - Win32 Release"
# Name "jbioapi - Win32 Debug"
# Name "jbioapi - Win32 MemDebug"
# Begin Group "Source Files"

# PROP Default_Filter "cpp;c;cxx;rc;def;r;odl;idl;hpj;bat"
# Begin Source File

SOURCE=.\extra.c
# End Source File
# Begin Source File

SOURCE=.\jbioapi_wrap.c
# End Source File
# End Group
# Begin Group "Header Files"

# PROP Default_Filter "h;hpp;hxx;hm;inl"
# Begin Source File

SOURCE=..\..\include\bioapi.h
# End Source File
# Begin Source File

SOURCE=..\..\include\bioapi_api.h
# End Source File
# Begin Source File

SOURCE=..\..\include\bioapi_err.h
# End Source File
# Begin Source File

SOURCE=..\..\include\port\bioapi_lock.h
# End Source File
# Begin Source File

SOURCE=..\..\include\port\bioapi_port.h
# End Source File
# Begin Source File

SOURCE=..\..\include\bioapi_schema.h
# End Source File
# Begin Source File

SOURCE=..\..\include\bioapi_spi.h
# End Source File
# Begin Source File

SOURCE=..\..\include\bioapi_type.h
# End Source File
# Begin Source File

SOURCE=..\..\include\bioapi_typecast.h
# End Source File
# Begin Source File

SOURCE=..\..\include\bioapi_uuid.h
# End Source File
# Begin Source File

SOURCE=..\..\include\biospi.h
# End Source File
# Begin Source File

SOURCE=..\..\include\biospi_type.h
# End Source File
# Begin Source File

SOURCE=.\internal.h
# End Source File
# Begin Source File

SOURCE=.\net_qrivy_bioapi_BioAPI.h
# End Source File
# Begin Source File

SOURCE=.\precomp.h
# End Source File
# End Group
# Begin Group "Resource Files"

# PROP Default_Filter "ico;cur;bmp;dlg;rc2;rct;bin;rgs;gif;jpg;jpeg;jpe"
# End Group
# Begin Source File

SOURCE=..\..\..\jbioapi_src\jbioapi.i
# End Source File
# End Target
# End Project
