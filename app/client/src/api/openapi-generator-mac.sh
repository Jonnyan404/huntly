wget --output-document api-docs.json "http://localhost:8080/api/v3/api-docs"
openapi-generator generate -i api-docs.json -g typescript-axios -o .