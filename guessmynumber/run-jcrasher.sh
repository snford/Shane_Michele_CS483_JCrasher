#!/usr/bin/env bash
set -euo pipefail

if [ $# -lt 1 ]; then
  echo "Usage: $0 <JavaClassName>"
  exit 1
fi

CLASS="$1"

PLANNER="jcrasher-planner-0.2.7.jar"
RUNTIME="jcrasher-runtime-0.2.7.jar"
REINIT="junit-reinit-0.2.8.jar"
JUNIT3="junit-3.8.1.jar"
BCEL="bcel-5.1.jar"
RE="regexp-1.3.jar"

SEP=":"
case "$(uname -s | tr '[:upper:]' '[:lower:]')" in
   mingw*|msys*|cygwin*) SEP=";";;
esac

javac "${CLASS}.java"

java -cp ".${SEP}${PLANNER}${SEP}${BCEL}${SEP}${RE}" \
  edu.gatech.cc.jcrasher.JCrasher "${CLASS}"

javac -encoding ISO-8859-1 \
  -cp ".${SEP}${JUNIT3}${SEP}${RUNTIME}${SEP}${REINIT}" \
  ${CLASS}Test*.java

java -cp ".${SEP}${JUNIT3}${SEP}${RUNTIME}${SEP}${REINIT}" \
  junit.textui.TestRunner "${CLASS}Test"

echo ">>> Done!"

