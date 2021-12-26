package project;
public interface IPositionChangeObserver {
    void positionChanged(Animal animal , Vector2d oldPosition, Vector2d newPosition);
    void positionChanged();
}
