# Contributing

The team reviews the API contract, screen flows, and shared data model before parallel feature work. Track undecided business rules rather than encoding assumptions in client behavior.

1. Branch from the latest `main` using `feature/<short-name>` or `fix/<short-name>`.
2. Keep each Pull Request focused and describe its user-visible behavior.
3. Run `./gradlew test lint assembleDebug` locally.
4. Request at least one teammate review and resolve comments.
5. Merge only after required CI checks pass.

Do not commit secrets, signing keys, local SDK paths, or generated build files.
