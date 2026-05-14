# Aplicaciones Móviles - Unidad 10: CI/CD, Publicación y Operación
## Post-Contenido 1 - Ingeniería de Sistemas 2026

Este proyecto implementa un pipeline CI/CD completo para una aplicación Android usando GitHub Actions, incluyendo lint, pruebas unitarias, build del AAB/APK firmado y distribución automática a Firebase App Distribution.

## Flujo del Pipeline

1.  **Lint**: Análisis estático de código.
2.  **Pruebas Unitarias**: Ejecución de tests locales.
3.  **Jacoco Report**: Generación de reportes de cobertura.
4.  **Quality Gate**: Verificación de cobertura mínima (60%).
5.  **Build Release**: Generación del APK firmado.
6.  **Distribución**: Subida automática a Firebase App Distribution.

## Configuración de GitHub Secrets

Para el funcionamiento del pipeline, se configuraron los siguientes secretos en GitHub:

*   `KEYSTORE_BASE64`: String Base64 del Keystore generado.
*   `KEYSTORE_PASS`: Contraseña del Keystore.
*   `KEY_ALIAS`: Alias definido al crear el Keystore.
*   `KEY_PASS`: Contraseña del alias.
*   `FIREBASE_APP_ID`: App ID de Firebase.
*   `FIREBASE_TOKEN`: Token de autenticación de Firebase CLI.

## Badge de Estado
[![Android CI/CD](https://github.com/jerc31/Rozo-post1_u10/actions/workflows/androidci.yml/badge.svg)](https://github.com/jerc31/Rozo-post1_u10/actions/workflows/androidci.yml)

---

## Checkpoints de la Actividad

### Checkpoint 1: Pipeline Básico Funcional
*   Workflow configurado en `.github/workflows/androidci.yml`.
*   Secretos configurados en el repositorio.
*   Job `lint-and-test` completado exitosamente.

![Checkpoint 1](capturas/checkpoint1.png)

### Checkpoint 2: Build Firmado y Distribuido
*   Job `build-and-distribute` ejecutado en la rama `main`.
*   APK firmado verificado con `apksigner`.
*   Distribución exitosa en la consola de Firebase.

![Checkpoint 2](capturas/checkpoint2.png)

### Checkpoint 3: Quality Gate Configurado
*   Generación de reportes HTML de JaCoCo.
*   Pipeline falla si la cobertura < 60%.
*   Badge de estado funcional en el README.

![Checkpoint 3](capturas/checkpoint3.png)

---
*Nota: Reemplace las imágenes en la carpeta `capturas/` con sus evidencias reales.*
