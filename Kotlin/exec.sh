#!/bin/bash
echo "コンパイルします"
kotlinc Main.kt -include-runtime -d Main.jar 
# if test $? = 0 ; then 
if [ $? = 0 ] ; then 
  echo "実行します"
  java -jar Main.jar
else
  echo "コンパイルに失敗しました[終了]"
fi
