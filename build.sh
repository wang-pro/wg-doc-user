set -e

mvn clean

mvn package -Dmaven.test.skip=true

echo "Build success"
