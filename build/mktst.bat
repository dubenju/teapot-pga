REM java -cp ..\lib\ -jar ..\lib\evosuite-1.0.6.jar -base_dir .\ -class teapot.pga.Loc -projectCP ..\target\classes\ -target ..\
REM .\build\mktst.bat
java -cp .\lib\ -jar .\lib\evosuite-1.0.6.jar -base_dir .\ -class %1 -projectCP .\target\classes\ -target .\

