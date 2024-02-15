#!/bin/bash
#launching container

echo "building image!"
docker build -t my-playground .
echo "build completed!"
echo "now, starting container!"
docker run -d -p 8080:5173 -v "$(pwd)":/app -v /app/node_modules --rm my-playground
echo "container launched! let's roll!"