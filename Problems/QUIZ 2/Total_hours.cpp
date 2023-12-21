#include <stdio.h>

int main() {
    int totalHours, days, workers;

    printf("Enter total number of hours needed: ");
    scanf("%d", &totalHours);

    printf("Enter number of days: ");
    scanf("%d", &days);

    printf("Enter number of workers: ");
    scanf("%d", &workers);

    int availableHours = (int)(days * 0.9 * 8 * workers);

    int totalWorkingHours = availableHours + (days * 2 * workers);

    int hoursLeft = totalHours - totalWorkingHours;

    if (hoursLeft <= 0) {
        printf("Yes! %d hours left.\n", -hoursLeft);
    } else {
        printf("Not enough time! %d hours needed.\n", hoursLeft);
    }

    return 0;
}
