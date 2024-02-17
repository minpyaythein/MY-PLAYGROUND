#!/bin/bash
#launching container

echo "building container!"
docker build -t my-playground .
echo "container built!"
echo "launching container!"
docker run -d -p 8080:5173 -v "$(pwd)":/app -v /app/node_modules --rm my-playground
echo "container launched! let's roll!"