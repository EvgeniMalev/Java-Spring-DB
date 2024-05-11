@echo off
setlocal

set DIRNAME=%~dp0
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

if exist "%HOME%\m2" set M2_HOME=%HOME%\m2
if exist "%HOME%\maven" set M2_HOME=%HOME%\maven
if exist "%HOME%\.m2" set M2_HOME=%HOME%\.m2
if exist "%HOME%\.maven" set M2_HOME=%HOME%\.maven

if not defined M2_HOME goto ERROR_NO_MAVEN

set MAVEN_CMD_LINE_ARGS=%*

set MAVEN_OPTS=-Xmx512m %MAVEN_OPTS%

"%M2_HOME%\bin\mvn" %MAVEN_CMD_LINE_ARGS%

:end
