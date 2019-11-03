@echo off
SETLOCAL

cls

set BUILD_FILE=build.xml
set VIA_HOME=
set JAVA_HOME=
set ANT_HOME=

goto :build

:build
echo ------------------------------------------------------------------------
echo Accessing Development Package  : %VIA_HOME%
echo ------------------------------------------------------------------------
echo.
echo Development Time [%DATE% - %TIME%]
echo ANT_HOME: %ANT_HOME%
echo JAVA_HOME: %JAVA_HOME%
echo ------------------------------------------------------------------------
echo.

"%JAVA_HOME%/bin/java" -cp %ANT_HOME%/lib/ant.jar;%ANT_HOME%/lib/ant-launcher.jar;%ANT_HOME%/lib/ant-trax.jar;%ANT_HOME%/lib/ant-junit.jar;%ANT_HOME%/lib/ant-nodeps.jar;"%JAVA_HOME%/lib/tools.jar" org.apache.tools.ant.Main -buildfile %BUILD_FILE% %*

:end
echo.
echo.
ENDLOCAL
:finish