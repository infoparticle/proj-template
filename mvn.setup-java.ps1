$jdkPath = "C:\Users\gopinat\.jabba\jdk\adopt@1.8.0-292"
$env:JAVA_HOME = $jdkPath
$env:Path = "$jdkPath/bin;" + $env:Path
