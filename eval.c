#include<stdio.h>
#define MAX 20
void push1(int* a,int* top1,int* top2,int element)
{
    if(*top1<*top2-1)
        a[++(*top1)]=element;
    else
        printf("Overflow\n");
}
void push2(int* a,int* top1,int* top2,int element)
{
    if(*top1<*top2-1)
        a[--(*top2)]=element;
    else
        printf("Overflow\n");
}
int pop1(int* a,int* top1)
{
    if(*top1!=-1)
    return a[(*top1)--];
    else
    {
        printf("Underflow\n");
        return -1;
    }
}
int pop2(int* a,int* top2)
{
    if(*top2<MAX)
    return a[(*top2)++];
    else
    {
        printf("Underflow\n");
        return -1;
    }
}
int main()
{
    int a[MAX];
    int top1=-1;
    int top2=MAX;
    push1(a,&top1,&top2,5);
    push2(a,&top1,&top2,6);
    push2(a,&top1,&top2,8);
    push1(a,&top1,&top2,1);
    printf("Pop from 1 %d\n",pop1(a,&top1));
    printf("Pop from 2 %d\n",pop2(a,&top2));
    return 0;

}
