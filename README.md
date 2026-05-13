# Pipeline CI/CD Android - Post-Contenido 1

Este proyecto implementa un pipeline de Integración y Despliegue Continuo (CI/CD) para una aplicación Android utilizando GitHub Actions y Firebase App Distribution.

## Flujo del Pipeline

1.  **Lint y Pruebas Unitarias**: Se ejecuta el análisis de código (lint) y las pruebas unitarias.
2.  **Reporte de Cobertura**: Se genera un reporte con JaCoCo.
3.  **Quality Gate**: El pipeline falla si la cobertura de código es inferior al 60%.
4.  **Build Firmado**: Se genera un APK de release firmado con un Keystore almacenado de forma segura.
5.  **Distribución**: El APK se sube automáticamente a Firebase App Distribution para los testers.

## Configuración de GitHub Secrets

Para que el pipeline funcione, se deben configurar los siguientes secretos en el repositorio (Settings → Secrets and variables → Actions):

*   `KEYSTORE_BASE64`: El contenido del archivo `.jks` codificado en Base64.
*   `KEYSTORE_PASS`: Contraseña del Keystore.
*   `KEY_ALIAS`: Alias de la llave.
*   `KEY_PASS`: Contraseña del alias.
*   `FIREBASE_APP_ID`: ID de la aplicación en Firebase.
*   `FIREBASE_TOKEN`: Token de autenticación de Firebase (`firebase login:ci`).

## Badge de Estado

![Android CI/CD](https://github.com/jerc31/Rozo-post1_u10/actions/workflows/androidci.yml/badge.svg)

---

## Checkpoints

### Checkpoint 1: Pipeline Básico Funcional
*   Workflow en `.github/workflows/androidci.yml`.
*   Secretos configurados.
*   Job `lint-and-test` exitoso.
> **[CAPTURA_CHECKPOINT_1_AQUÍ]**

### Checkpoint 2: Build Firmado y Distribuido
*   Job `build-and-distribute` ejecutado en `main`.
*   APK firmado correctamente.
*   Distribución en Firebase exitosa.
> **[CAPTURA_CHECKPOINT_2_AQUÍ]**

### Checkpoint 3: Quality Gate Configurado
*   JaCoCo genera reportes HTML.
*   Falla si la cobertura < 60%.
*   Badge de estado en README.
> **[CAPTURA_CHECKPOINT_3_AQUÍ]**
