#include <stdio.h>
#include <math.h>

struct Point {
    int x;
    int y;
};

double distance(struct Point *p1, struct Point *p2) {
    int deltaX = p2->x - p1->x;
    int deltaY = p2->y - p1->y;
    return sqrt(deltaX * deltaX + deltaY * deltaY);
}

int isRightTriangle(struct Point *p1, struct Point *p2, struct Point *p3) {
    double a = distance(p1, p2);
    double b = distance(p2, p3);
    double c = distance(p1, p3);

    double maxSide = a;
    if (b > maxSide) maxSide = b;
    if (c > maxSide) maxSide = c;

    double sumOfSquares = a * a + b * b + c * c - maxSide * maxSide;

    // To avoid floating-point precision issues, compare with a small tolerance
    double tolerance = 0.000001;
    return fabs(maxSide * maxSide - sumOfSquares) < tolerance;
}

int main() {
    struct Point p1 = {0, 0};
    struct Point p2 = {3, 0};
    struct Point p3 = {0, 4};

    if (isRightTriangle(&p1, &p2, &p3)) {
        printf("The points form a right triangle.\n");
    } else {
        printf("The points do not form a right triangle.\n");
    }

    return 0;
}
